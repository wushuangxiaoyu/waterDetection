
//画饼状图
$("document").ready(function(){
	getChart();
})
$("#eqp_pie").change(function(){
	getChart();
});

//饼状图函数
function getChart(name,eqp){
	var eqp=$("#eqp_pie option:selected").val();
	var m;
	var myChart1 = echarts.init(document.getElementById('pie1'));
	var myChart2 = echarts.init(document.getElementById('pie2'));
	var myChart3 = echarts.init(document.getElementById('pie3'));
    var myChart4 = echarts.init(document.getElementById('pie4'));
    var myChart5 = echarts.init(document.getElementById('pie5'));
 	$.ajax({
 	   type:"POST",
 	   url: "chart/getPieData/"+eqp,
 	   success: function(msg){
 		  myChart1.setOption({
	 			 title : {
	  		        text: 'PH值',
	  		        subtext: '以每日平均值为准',
	  		        x:'left'
	  		    },
 		        series:{ 
 		        	data: msg.m_ph
 		        }
 		    });
 		 myChart2.setOption({
 			 title : {
  		        text: '温度',
  		        subtext: '以每日平均值为准',
  		        x:'left'
  		    },
		        series:{ 
		        	data: msg.m_tmp
		        }
		    });
 		myChart3.setOption({
			 title : {
 		        text: '溶氧量',
 		        subtext: '以每日平均值为准',
 		        x:'left'
 		    },
		        series:{ 
		        	data: msg.m_oxy
		        }
		    });
           myChart4.setOption({
               title : {
                   text: '氨氮含量',
                   subtext: '以每日平均值为准',
                   x:'left'
               },
               series:{
                   data: msg.m_Heavy
               }
           });
           myChart5.setOption({
               title : {
                   text: '磷含量',
                   subtext: '以每日平均值为准',
                   x:'left'
               },
               series:{
                   data: msg.m_Chy
               }
           });
 	   }
 	});
 	option = {
 		    tooltip: {
 		        trigger: 'item',
 		        formatter: "{a} <br/>{b}: {c} ({d}%)"
 		    },
 		    
 		    series: [
 		        {
 		           
 		            type:'pie',
 		            radius: ['50%', '70%'],
 		            avoidLabelOverlap: false,
 		            label: {
 		                normal: {
 		                    show: false,
 		                   // position: 'center'
 		                },
 		                emphasis: {
 		                    show: true,
 		                    textStyle: {
 		                        fontSize: '30',
 		                        fontWeight: 'bold'
 		                    }
 		                }
 		            },
 		            labelLine: {
 		                normal: {
 		                    show: false
 		                }
 		            },
 		           
 		        }
 		    ]
 		};
	 myChart1.setOption(option);
	 myChart2.setOption(option);
	 myChart3.setOption(option);
   	 myChart4.setOption(option);
	 myChart5.setOption(option);
}




