$(document).ready(function(){
  // 在这里写你的代码...
    changeWhat($("#eqp option:selected").val());
   	getEqpAndWhat();
});
$("#eqp").change(function(){
	changeWhat($("#eqp option:selected").val());
});

$("#lidu").change(function () {
	getEqpAndWhat();
});
function getEqpAndWhat (){
    var eqpId=$("#eqp option:selected").val();
    var what=$("#lidu option:selected").val();
    if(what=="PH")
        what=0;
    if(what==="温度&含氧量")
        what=1;
    if(what==="氨氮含量")
        what=2;
    if(what=="磷含量")
        what=3;
    writeChart(eqpId,what);
}
//查看设备需要测量的数据
function changeWhat(eqpId){
    $.ajax({
        type:"POST",
        url: 'getFlag',
		async:false,
        data: "id="+eqpId,
        success: function(result){
        	$("#lidu").empty();
			if(result[0]==1)
				$("#lidu").append("<option>PH</option>");
            if(result[1]==1)
                $("#lidu").append("<option>温度&含氧量</option>");
            if(result[2]==1)
                $("#lidu").append("<option>氨氮含量</option>");
            if(result[3]==1)
                $("#lidu").append("<option>磷含量</option>");
        }
    })
}

function writeChart(eqpId,what) {
	Highcharts.setOptions({
	    global: {
	        useUTC: false
	    }
	});
	function activeLastPointToolip(chart) {
	    var points = chart.series[0].points;
	    chart.tooltip.refresh(points[points.length -1]);
	}
		$('#container1').highcharts({
		    chart: {
		        type: 'spline',
		        animation: Highcharts.svg, // don't animate in old IE
		        marginRight: 10,
		        events: {
		            load: function () {
		                // set up the updating of the chart each second
		                var series = this.series[0],
		                    chart = this;
		                var array1 = new Array();		                
		                //每次更新一个点
		                setInterval(function () {
		                	$.ajax({
		                	url: 'chart/realTime/'+eqpId+'/'+what,
		            		dataType: 'json',
		            		success: function(result){
		            			var obj = eval(result);
			                	var x = obj[0].x;
		                        var y = obj[0].y;

		                        var last=series.xData[(series.xData).length -1];
		                        if(x!=series.xData[series.xData.length -1]){
			                	series.addPoint([x, y], true, true);
			                	activeLastPointToolip(chart);
		                       }
		            			}
		                	})
		                }, 10000);
		            }		
		        }
		    },
		    title: {
		        text: '动态模拟实时数据'
		    },
		    xAxis: {
		    	type: 'datetime',
		    	tickPixelInterval: 150
		    },
		    yAxis: {
		        title: {
		            text: ''
		        },
		        plotLines: [{
		            value: 0,
		            width: 1,
		            color: '#808080'
		        }]
		    },
		    tooltip: {
		        formatter: function () {
		            return '<b>' + this.series.name + '</b><br/>' +
		                Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
		                Highcharts.numberFormat(this.y, 2);
		        }
		    },
		    legend: {
		        enabled: false
		    },
		    exporting: {
		        enabled: false
		    },
		    series: [{
		        name: '随机数据',
		        data: (function () {
		            // generate an array of random data
		        	var data = [],obj,
		        	i;
		        		/*time = (new Date()).getTime(),
		        		i;
            			//时间以发送请求的时间为准，还是JS获取的时间为准，搞清楚。
	                	var x = (new Date()).getTime(); // current time
	                	//var x = obj[0].x;
	                	for (i = -19; i <=0; i += 1) {
			                data.push({
			                    x: time + i * 1000,
			                    y: 7
			                });
				}*/
		        	$.ajax({
	                	url: 'chart/realTime/'+eqpId+'/'+what,
	            		dataType: 'json',
	            		async: false,
	            		success: function(result){
	            			obj = eval(result);
	            			}
	                	});
		        	//这里是初始数据，
		        	for (var i = 0; i <=19; i += 1) {
		                data.push({
		                    x: obj[i].x,
		                    y: obj[i].y
		                });
        			}
		            return data;
		        }())
		    }]
		}, function(c) {
			activeLastPointToolip(c)
		});
}