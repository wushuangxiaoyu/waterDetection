

$("#getPH").bind("click",function(){
		var eqp=$("#PH #eqp option:selected").val();
		var lidu=$("#PH #lidu option:selected").val();
	 	var tongji=$("#PH #tongji option:selected").val();
	 	var i=0;
	 	if(tongji==="最小值")
	 		i=1;
	 	else if(tongji==="平均值")
	 		i=2;
	 	var startTime=$("#PH  .element_id1").val();
	 	var endTime=$("#PH .element_id2").val();
	 	var arr1=startTime.split("-");
	 	var arr2=endTime.split("-");
	 	var date1 = new Date(arr1[0],parseInt(arr1[1])-1,arr1[2]).getTime(); 
	 	var date2 = new Date(arr2[0],parseInt(arr2[1])-1,arr2[2]).getTime();
	 	if(startTime===""||endTime===""){
	 		$("#modalP").text("请填起始时间和结束时间！");
	 		$('#myModal2').modal('show');
	 		return;
	 	}
	 	if(date2<date1){
	 		$("#modalP").text("起始时间大于结束时间！");
	 		$('#myModal2').modal('show');
	 		return;
	 	}
	 	
	 	if(lidu==="小时"){
	 		var days =(date2-date1)/1000/60/60/24;
	 		if(days>30){
	 			$("#modalP").text("粒度太小,时间跨度太大！<br>请改变粒度或者时间跨度以便于你的查看！");
		 		$('#myModal2').modal('show');
	 			return ;
	 		}	
	 	}
	 	var water_std;
	 	//获取阈值
	 	$.ajax({
	 	   type:"POST",
	 	   url: "getThreshold/"+eqp,
	 	   success: function(msg){
	 	     water_std=msg;
	 	   }
	 	});
	 	
	 	//减去时区差
	 	Highcharts.setOptions({ global: { useUTC: false } });
	 	//发送请求 绘制图表
	 	$.ajax({ 
   			type:"POST",
   			url: "chart/pipeline/"+eqp+"/0/"+i+"/"+lidu,
	 		context: document.body,
	 		data: "startTime="+date1+"&endTime="+date2,
   			dataType: "json", 
   			success: function(a,b,ajax_data){
		        // Create the chart
		        //alert("成功返回");
		        var jsonJava=ajax_data.responseText;
				var js_on=eval("("+jsonJava+")");
				//alert(size);
		        $('#container').highcharts('StockChart', {
		        	 yAxis: {
		        	        plotLines: [
        	                    {
		        	            value: water_std.maxPh,
		        	            width: 1,
		        	            color: 'red',
		        	            dashStyle: 'dash',
		        	            zIndex:4,
		        	            label: {
		        	                text: 'PH上阈值               ',
		        	                align: 'left',
		        	                y: 12,
		        	                x: 0
		        	            }
		        	        },
		        	        {
		        	            value: water_std.minPh,
		        	            width: 1,
		        	            color: 'red',
		        	            dashStyle: 'dash',
		        	            zIndex:4,
		        	            label: {
		        	                text: 'PH下阈值               ',
		        	                align: 'left',
		        	                y: 12,
		        	                x: 0
		        	            }
		        	        }]
		        	    },
		        	credits: {
				        enabled: false
				    },
		        	rangeSelector : {enabled: false },
		            
		            title : {
		                text : 'PH 值'
		            },
		            series : [{
		                name : 'PH 值',
		                data : a,
		                lineWidth : 1,
		                marker : {
		                    enabled : true,
		                    radius : 2
		                },
		                tooltip: {
		                    valueDecimals: 2
			                }
			            }]
			        });
			    }
	 }); 	
});

//温度&溶氧量
$("#getOxy").bind("click",function(){
		var eqp=$("#OXY #eqp option:selected").val();
		var lidu=$("#OXY #lidu option:selected").val();
	 	var tongji=$("#OXY #tongji option:selected").val();
	 	var j=0;
	 	if(tongji==="最小值")
	 		j=1;
	 	else if(tongji==="平均值")
	 		j=2;
	 	var startTime=$("#OXY  .element_id1").val();
	 	var endTime=$("#OXY .element_id2").val();
	 	var arr1=startTime.split("-");
	 	var arr2=endTime.split("-");
	 	var date1 = new Date(arr1[0],parseInt(arr1[1])-1,arr1[2]).getTime(); 
	 	var date2 = new Date(arr2[0],parseInt(arr2[1])-1,arr2[2]).getTime();
	 	if(date1==0||date2==0){
	 		$("#modalP").text("请填起始时间和结束时间！");
	 		$('#myModal2').modal('show');
	 		return;
	 	} 	
	 	if(date2<date1){
	 		$("#modalP").text("起始时间大于结束时间！");
	 		$('#myModal2').modal('show');
	 		return;
	 	}
	 	
	 	if(lidu==="小时"){
	 		var days =(date2-date1)/1000/60/60/24;
	 		if(days>30){
	 			$("#modalP").text("粒度太小,时间跨度太大！<br>请改变粒度或者时间跨度以便于你的查看！");
		 		$('#myModal2').modal('show');
	 			return ;
	 		}	
	 	}
	 	var water_std;
		$.ajax({
			type:"POST",
			url: "getThreshold/"+eqp,
            async: false,
			success: function(msg){
				water_std=msg;
			}
		});
	 	Highcharts.setOptions({ global: { useUTC: false } });
	 	var seriesOptions = [],
	    seriesCounter = 0,
	    names = ['温度', '溶氧量'];
		
		createChart = function () {
            $('#container2').highcharts('StockChart', {
            	rangeSelector : {
                    selected : 1
                },
                title : {
                    text : '温度&溶氧量'
                },
                yAxis: [{ //第一个Y轴，序号为0
                	plotLines: [   	                
		        	        {
		        	            value: water_std.minTmp,
		        	            width: 1,
		        	            color: 'red',
		        	            dashStyle: 'dash',
		        	            zIndex:4,
		        	            label: {
		        	                text: '温度下阈值',
		        	                align: 'right',
		        	                y: 12,
		        	                x: 0
		        	            }
		        	        },
		        	        {
		        	            value: water_std.maxTmp,
		        	            width: 1,
		        	            color: 'red',
		        	            dashStyle: 'dash',
		        	            zIndex:4,
		        	            label: {
		        	                text: '温度上阈值 ',
		        	                align: 'right',
		        	                y: 12,
		        	                x: 0
		        	            }
		        	        }
		        	        ],
	        	            labels: {
	        	                format: '{value} °C',
	        	                style: {
	        	                    color: '#89A54E'
	        	                }
	        	            },
	        	            title: {
	        	                text: '温度',
	        	                style: {
	        	                    color: '#89A54E'
	        	                }
	        	            }
	        	        }, 
	        			{ //第二个Y轴，序号为1
			        		plotLines: [
		        	                    {
				        	            value: water_std.maxOxy,
				        	            width: 1,
				        	            color: 'green',
				        	            dashStyle: 'dash',
				        	            zIndex:4,
				        	            label: {
				        	                text: '含氧量上阈值               ',
				        	                align: 'left',
				        	                y: 12,
				        	                x: 0
				        	            }
				        	        },
				        	        {
				        	            value: water_std.minOxy,
				        	            width: 1,
				        	            color: 'green',
				        	            dashStyle: 'dash',
				        	            zIndex:4,
				        	            label: {
				        	                text: '含氧量下阈值               ',
				        	                align: 'left',
				        	                y: 12,
				        	                x: 0
				        	            }
				        	        }],
	        	            title: {
	        	                text: '溶氧量',
	        	                style: {
	        	                    color: '#4572A7'
	        	                }
	        	            },
	        	            labels: {
	        	                format: '{value} mg/L',
	        	                style: {
	        	                    color: '#4572A7'
	        	                }
	        	            },
	        	            opposite: false
	        	        }],
	        			series: seriesOptions
            });
        };
        
        $.each(names, function (i, name) {
        	/*$.ajax({
       			type:"POST",
                context: document.body,
                data: "eqp="+eqp+"&lidu="+lidu+"&startTime="+date1+"&endTime="+date2+"&j="+j,
       			url: "chart/pipelineData_OxyAction"+i,
       			dataType: "json", */
        	var i2;
        	if(i==1) i2=1;
        	else i2=4;
            $.ajax({
                type:"POST",
                url: "chart/pipeline/"+eqp+"/"+i2+"/"+j+"/"+lidu,
                context: document.body,
                async: false,
                data: "startTime="+date1+"&endTime="+date2,
                dataType: "json",
                success:function (a,b,ajax_data) {
                    var jsonJava=ajax_data.responseText;
                    var js_on=eval("("+jsonJava+")");
                    var array=js_on.list;
		                seriesOptions[i] = {
		                    name: name,
		                    data: a,
		                    marker : {
		                        enabled : true,
		                        radius : 3
		                    },
		                    yAxis: i,
		                    shadow : true,
		                    lineWidth : 1,
		                    tooltip : {
		                        valueDecimals : 2,
		                        valueSuffix: js_on.suffix,
		                    }
		                };
		                
		                seriesCounter += 1;
		                if (seriesCounter === names.length) {
		                    createChart();
		                }
		                
		        	}
        	 });
        });	
});
//氨氮含量
$("#HEAVY").bind("click",function(){
    var eqp=$("#HEAVY #eqp option:selected").val();
    var lidu=$("#HEAVY #lidu option:selected").val();
    var tongji=$("#HEAVY #tongji option:selected").val();
    var i=0;
    if(tongji==="最小值")
        i=1;
    else if(tongji==="平均值")
        i=2;
    var startTime=$("#HEAVY  .element_id1").val();
    var endTime=$("#HEAVY .element_id2").val();
    var arr1=startTime.split("-");
    var arr2=endTime.split("-");
    var date1 = new Date(arr1[0],parseInt(arr1[1])-1,arr1[2]).getTime();
    var date2 = new Date(arr2[0],parseInt(arr2[1])-1,arr2[2]).getTime();
    if(startTime===""||endTime===""){
        $("#modalP").text("请填起始时间和结束时间！");
        $('#myModal2').modal('show');
        return;
    }
    if(date2<date1){
        $("#modalP").text("起始时间大于结束时间！");
        $('#myModal2').modal('show');
        return;
    }

    if(lidu==="小时"){
        var days =(date2-date1)/1000/60/60/24;
        if(days>30){
            $("#modalP").text("粒度太小,时间跨度太大！<br>请改变粒度或者时间跨度以便于你的查看！");
            $('#myModal2').modal('show');
            return ;
        }
    }
    var water_std;
    //获取阈值
    $.ajax({
        type:"POST",
        url: "getThreshold/"+eqp,
        success: function(msg){
            water_std=msg;
        }
    });

    //减去时区差
    Highcharts.setOptions({ global: { useUTC: false } });
    //发送请求 绘制图表
    $.ajax({
        type:"POST",
        url: "chart/pipeline/"+eqp+"/2/"+i+"/"+lidu,
        context: document.body,
        data: "startTime="+date1+"&endTime="+date2,
        dataType: "json",
        success: function(a){

            $('#container3').highcharts('StockChart', {
                yAxis: {
                    plotLines: [
                        {
                            value: water_std.maxHeavy,
                            width: 1,
                            color: 'red',
                            dashStyle: 'dash',
                            zIndex:4,
                            label: {
                                text: '上阈值               ',
                                align: 'left',
                                y: 12,
                                x: 0
                            }
                        },
                        {
                            value: water_std.minHeavy,
                            width: 1,
                            color: 'red',
                            dashStyle: 'dash',
                            zIndex:4,
                            label: {
                                text: '下阈值               ',
                                align: 'left',
                                y: 12,
                                x: 0
                            }
                        }]
                },
                credits: {
                    enabled: false
                },
                rangeSelector : {enabled: false },

                title : {
                    text : '氨氮含量'
                },
                series : [{
                    name : '氨氮含量',
                    data : a,
                    lineWidth : 1,
                    marker : {
                        enabled : true,
                        radius : 2
                    },
                    tooltip: {
                        valueDecimals: 2
                    }
                }]
            });
        }
    });
});

//磷含量
$("#CHY").bind("click",function(){
    var eqp=$("#CHY #eqp option:selected").val();
    var lidu=$("#CHY #lidu option:selected").val();
    var tongji=$("#CHY #tongji option:selected").val();
    var i=0;
    if(tongji==="最小值")
        i=1;
    else if(tongji==="平均值")
        i=2;
    var startTime=$("#CHY  .element_id1").val();
    var endTime=$("#CHY .element_id2").val();
    var arr1=startTime.split("-");
    var arr2=endTime.split("-");
    var date1 = new Date(arr1[0],parseInt(arr1[1])-1,arr1[2]).getTime();
    var date2 = new Date(arr2[0],parseInt(arr2[1])-1,arr2[2]).getTime();
    if(startTime===""||endTime===""){
        $("#modalP").text("请填起始时间和结束时间！");
        $('#myModal2').modal('show');
        return;
    }
    if(date2<date1){
        $("#modalP").text("起始时间大于结束时间！");
        $('#myModal2').modal('show');
        return;
    }

    if(lidu==="小时"){
        var days =(date2-date1)/1000/60/60/24;
        if(days>30){
            $("#modalP").text("粒度太小,时间跨度太大！<br>请改变粒度或者时间跨度以便于你的查看！");
            $('#myModal2').modal('show');
            return ;
        }
    }
    var water_std;
    //获取阈值
    $.ajax({
        type:"POST",
        url: "getThreshold/"+eqp,
        success: function(msg){
            water_std=msg;
        }
    });

    //减去时区差
    Highcharts.setOptions({ global: { useUTC: false } });
    //发送请求 绘制图表
    $.ajax({
        type:"POST",
        url: "chart/pipeline/"+eqp+"/3/"+i+"/"+lidu,
        context: document.body,
        data: "startTime="+date1+"&endTime="+date2,
        dataType: "json",
        success: function(a){
            $('#container4').highcharts('StockChart', {
                yAxis: {
                    plotLines: [
                        {
                            value: water_std.maxHeavy,
                            width: 1,
                            color: 'red',
                            dashStyle: 'dash',
                            zIndex:4,
                            label: {
                                text: '上阈值               ',
                                align: 'left',
                                y: 12,
                                x: 0
                            }
                        },
                        {
                            value: water_std.minHeavy,
                            width: 1,
                            color: 'red',
                            dashStyle: 'dash',
                            zIndex:4,
                            label: {
                                text: '下阈值               ',
                                align: 'left',
                                y: 12,
                                x: 0
                            }
                        }]
                },
                credits: {
                    enabled: false
                },
                rangeSelector : {enabled: false },

                title : {
                    text : '磷含量'
                },
                series : [{
                    name : '磷含量',
                    data : a,
                    lineWidth : 1,
                    marker : {
                        enabled : true,
                        radius : 2
                    },
                    tooltip: {
                        valueDecimals: 2
                    }
                }]
            });
        }
    });
});





