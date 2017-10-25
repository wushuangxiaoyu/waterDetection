$("#getTableData").bind("click",function(){
		
		
		var eqp=$("#screenDataTable #eqp option:selected").val();
	 	/*var tongji=$("#screenDataTable #tongji option:selected").val();

	 	var i=0;
	 	if(tongji==="最小值")
	 		i=1;
	 	else if(tongji==="平均值")
	 		i=2;*/
	 	var startTime=$("#screenDataTable  #element_tableStart").val();

	 	var arr1=startTime.split("-");

	 	var date1 = new Date(arr1[0],parseInt(arr1[1])-1,arr1[2]).getTime();


	 	//请求获取阈值
		var water_std;
		$.ajax({
			type:"POST",
			url: "getThreshold/"+eqp,
			async: false,
			success: function(msg){
				water_std=msg;
			}
		});
		table=$("#tableData1").DataTable( {
	        	//"ajax": "table/getData/"+eqp+"?startTime="+date1+"&endTime="+date2,
				ajax: {
					url: "table/getData/"+eqp+"?startTime="+date1,
                    async: false,
				},
				"bDestroy": true,
				"columns": [
		            { 	"data": "time",
		            	"width":"30%",
		            },
		            { 	"data": "waterPh",
		            	"width":"14%",
		            	"render": function(data,type,full){
                            if(data==null)
                                return "--";
		            		if(data<water_std.maxPh&&data>water_std.minPh)
		            			return  data;
		            		else 
		            			return "<span style='color:red'>" + data + "</span>";          		
		            	}
		            },
		            { 	"data": "waterTmp",
		            	"width":"14%" ,
		            	"render": function(data,type,full){
                            if(data==null)
                                return "--";
		            		if(data<water_std.maxTmp&&data>water_std.minTmp)
		            			return  data;
		            		else 
		            			return "<span style='color:red'>" + data + "</span>";          		
		            	}
		            },
		            { 	"data": "waterOxy",
			            "width":"14%",
			            "render": function(data,type,full){
                            if(data==null)
                                return "--";
		            		if(data<water_std.maxOxy&&data>water_std.minOxy)
		            			return  data;
		            		else 
		            			return "<span style='color:red'>" + data + "</span>";          		
		            	}
			        },
                    { 	"data": "waterHeavy",
                        "width":"14%",
                        "render": function(data,type,full){
                    		if(data==null)
                    			return "--";
                            if(data<water_std.maxHeavy&&data>water_std.minHeavy)
                                return  data;
                            else
                                return "<span style='color:red'>" + data + "</span>";
                        }
                    },
                    { 	"data": "waterChy",
                        "width":"14%",
                        "render": function(data,type,full){
                    		if(data==null)
                    			return "--";
                            if(data<water_std.maxChy&&data>water_std.minChy)
                                return  data;
                            else
                                return "<span style='color:red'>" + data + "</span>";
                        }
                    }
		        ],
		        /*语言设置*/  
		        "oLanguage": {  
		            "sLengthMenu": "每页显示 _MENU_条",  
		            "sZeroRecords": "没有找到符合条件的数据",  
		            "sProcessing": "<img src=’./loading.gif’ />",  
		            "sInfo": "当前第 _START_ - _END_ 条　共计 _TOTAL_ 条",  
		            "sInfoEmpty": "木有记录",  
		            "sInfoFiltered": "(从 _MAX_ 条记录中过滤)",  
		            "sSearch": "搜索：",  
		            "oPaginate": {  
		                "sFirst": "首页",  
		                "sPrevious": "前一页",  
		                "sNext": "后一页",  
		                "sLast": "尾页"  
		            }
		        }
		});
			   
	});





