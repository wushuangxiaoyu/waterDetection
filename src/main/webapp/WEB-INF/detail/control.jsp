<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="common/head.jsp"/>
	<link href="${pageContext.request.contextPath }/detail/js/tooltip/tooltip.css" rel="stylesheet" />
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=KyFfwEdehEoGoN8dQrRTsbFFFab7V64h"></script>
	<!-- end: CSS -->

		<jsp:include page="common/headMenu.jsp"/>

<!-- start: Header -->
	<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
			<jsp:include page="common/mainMenu.jsp"/>
			<!-- end: Main Menu -->
						
			<!-- start: Content -->
			<div id="content" class="span10" style="height: 1000px">
			
			
			<div class="row-fluid">
				
				<div class="box span12">
					<div class="box-header">
						<h2><i class="icon-edit"></i>设备管理</h2>
						<div class="box-icon">
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div id="MyWizard" class="wizard">
						<br>
						<h1>监控器状态</h1>
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
								 <table class="table table-bordered responsive" style="text-align: ">
				                    <thead>
				                        <tr> 
				                            <th>节点号</th> 
				                            <th>安装地点</th>
				                            <th>传感器</th>
				                            <th>状态</th> 
				                            <th>警戒值配置</th> 
				                            <th>设施清洗</th>
											<th>修改</th>
				                       	</tr>
				                    </thead>
				                    <tbody>
				                    	<c:choose>
								    		<c:when test="${not empty sessionScope.equipment }">
								    			<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
								    				<tr>
				                                        <td>${eqp.equipmentName }</td>
				                                        <td><a href="#" onclick="tooltip.pop(this, '#tip${eqp.equipmentName}');" >${eqp.xPoint }&nbsp&nbsp&nbsp${eqp.yPoint }</a>
				                                        	<div style="display:none;">
													            <div id="tip${eqp.equipmentName }">
													                <%--<img src="src/tooltips-cd2.jpg" style="float:right;margin-left:12px;width:75px;height:75px;" alt="" />--%>
													                <h3>设备名：${eqp.equipmentName }</h3>
																	<div id="allmap${eqp.equipmentName }"  style="min-width: 500px; min-height: 500px;" ></div>
													            </div>
													        </div>
													        <script type="text/javascript">
																var map = new BMap.Map("allmap${eqp.equipmentName }");
																map.centerAndZoom(new BMap.Point(${eqp.xPoint}-0.01,${eqp.yPoint}+0.005), 15);
																var data_info = [[${eqp.xPoint},${eqp.yPoint}]
																				];
																map.enableScrollWheelZoom();
																for(var i=0;i<data_info.length;i++){
																	var marker = new BMap.Marker(new BMap.Point(data_info[i][0],data_info[i][1]));  // 创建标注
																	var content = data_info[i][2];
																	map.addOverlay(marker);               // 将标注添加到地图中
																	addClickHandler(content,marker);
																}
															</script>
				                                        </td>
				                                        <td><c:if test="${eqp.flagPh==1}">PH</c:if>
															<c:if test="${eqp.flagTmpOxy==1}">，温度，含氧量</c:if>
															<c:if test="${eqp.flagHeavy==1}">，氨氮含量</c:if>
															<c:if test="${eqp.flagChy==1}">，磷含量</c:if>
														</td>
				                                        <c:choose>
				                                        	<c:when test="${eqp.waterCondition==1 }">
				                                        		<td><span style="color: green">正常工作</span></td>
				                                        	</c:when>
				                                        	<c:otherwise>
				                                        		<td><span style="color: red">故障</span></td>
				                                        	</c:otherwise>
				                                        </c:choose> 
				                                        <td><button class="btn btn-info showDetail"><span>查看详情</span></button></td>
				                                        <td class="centeralign">
				                                            <button class="btn btn-info clearEqp"><span class="icon-bell-alt">清洗</span></button>
														</td>
														<c:choose>
															<c:when test="${eqp.waterCondition==1 }">
																<td><button class="btn btn-info controlUpdate"><a href="control/update/${eqp.id}">修改</a></button>
																	<span style="visibility: hidden" class="eqpIdSpan">${eqp.id}</span>
																</td>
															</c:when>
															<c:otherwise>
																<td></td>
															</c:otherwise>
														</c:choose>
				                                    </tr>
								    			</c:forEach>
								    		</c:when>
								    		<c:otherwise>
								    		</c:otherwise>
							    		</c:choose>
	                                    
	                                	<tr> 
	                                        <td colspan="7" style="text-align: center;"><a href="#myModalAdd" role="button" class="btn" data-backdrop="static" data-toggle="modal">添加</a></td>
	                                  	</tr>
				                    </tbody>
				                </table>
							</div>
						</div>
					</div>	
				</div><!--/span-->
			</div><!--/row-->		
		    </div>
			<!-- end: Content -->
				
		</div><!--/fluid-row-->
				
		
		
		<div class="clearfix"></div>
		
		
		<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-header">
		    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		    <h3 id="myModalLabel">修改阈值(<span id="eqp"></span>)</h3>
		  </div>
		  <div class="modal-body" style="width: 100%">
		        <table style="min-width: 80%;text-align: center;" >
			      <tbody>
			        <tr>
			          <td>PH</td>
			          <td>
			          		<input class="input-mini" id="ph_low" readonly="readonly" type="text" value=""  style="color: #000000 !important"> --
			          		<input class="input-mini" id="ph_high" readonly="readonly" type="text" value=""  style="color: #000000 !important">
			          </td>
			        </tr>
			        <tr>
			          <td>温度(°C)</td>
			          <td>
			          		<input class="input-mini" id="tmp_low" readonly="readonly" type="text" value=""  style="color: #000000 !important">--
			          		 <input class="input-mini" id="tmp_high" readonly="readonly" type="text" value=""  style="color: #000000 !important">
			          </td>
			        </tr>
			        <tr>
			          <td>溶氧量(mg/L)</td>
			          <td>
			          		<input class="input-mini" id="oxy_low" readonly="readonly" type="text" value=""  style="color: #000000 !important"> --
			          		<input class="input-mini" id="oxy_high" readonly="readonly"  type="text" value=""  style="color: #000000 !important">
			          </td>
			        </tr>
					<tr>
						<td>氨氮含量(mg/L)</td>
						<td>
							<input class="input-mini" id="heavy_low" readonly="readonly" type="text" value=""  style="color: #000000 !important"> --
							<input class="input-mini" id="heavy_high" readonly="readonly"  type="text" value=""  style="color: #000000 !important">
						</td>
					</tr>
					<tr>
						<td>磷含量(mg/L)</td>
						<td>
							<input class="input-mini" id=chy_low" readonly="readonly" type="text" value=""  style="color: #000000 !important"> --
							<input class="input-mini" id="chy_high" readonly="readonly"  type="text" value=""  style="color: #000000 !important">
						</td>
					</tr>
			      </tbody>
			    </table>
		  </div>
		  <div class="modal-footer">
		    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
		  </div>
		</div>
		
		
		<footer>
			<br>
			<br>
			<p style="text-align:center">
				<span style="text-align:center">安徽农业大学 &copy; 2017<a target="_blank" href="#"></a></span>
			</p>

		</footer>
				
	</div><!--/.fluid-container-->

	<!-- start: JavaScript-->
		<jsp:include page="common/js.jsp"/>
		<script src="${pageContext.request.contextPath }/detail/js/tooltip/tooltip.js"></script>
		<script type="text/javascript">
  			$(".showDetail").bind("click",function(){
                var eqpId=$(this).parent().next().next().children(".eqpIdSpan").text();
                //var eqp=$(this).parent().parent().prev().children(":first").text();
                $("#myModal :text").val("");
                $("#myModal #ph_high").parent().parent().css("display","table-row");
                $("#myModal #tmp_high").parent().parent().css("display","table-row");
                $("#myModal #oxy_high").parent().parent().css("display","table-row");
                $("#myModal #heavy_high").parent().parent().css("display","table-row");
                $("#myModal #chy_high").parent().parent().css("display","table-row");
                $("#myModal #eqp").text(eqpId);
  				$.ajax({
			 	   type:"POST",
			 	   url: "getThreshold/"+eqpId,
			 	   success: function(msg){
			 	       if(msg.maxPh==null)
                           $("#myModal #ph_high").parent().parent().css("display","none");
			 	       else{
                           $("#myModal #ph_high").val(msg.maxPh);
                           $("#myModal #ph_low").val(msg.minPh);
					   }
                       if(msg.maxOxy==null)
                           $("#myModal #oxy_high").parent().parent().css("display","none");
                       else{
                           $("#myModal #oxy_high").val(msg.maxOxy);
                           $("#myModal #oxy_low").val(msg.minOxy);
                       }
                       if(msg.maxTmp==null)
                           $("#myModal #tmp_high").parent().parent().css("display","none");
                       else{
                           $("#myModal #tmp_high").val(msg.maxTmp);
                           $("#myModal #tmp_low").val(msg.minTmp);
                       }
					   if(msg.maxHeavy==null)
                           $("#myModal #heavy_high").parent().parent().css("display","none");
			 	       else{
                           $("#myModal #heavy_high").val(msg.maxHeavy);
                           $("#myModal #heavy_low").val(msg.minHeavy);
					   }
                       if(msg.maxChy==null)
                           $("#myModal #chy_high").parent().parent().css("display","none");
                       else{
                           $("#myModal #chy_high").val(msg.maxChy);
                           $("#myModal #chy_low").val(msg.minChy);
                       }
                       $('#myModal').modal('show');
                       //$("#myModal #ph_high").val(msg.std.ph_high);
			 	   }
			 	});
  			});

  			/*$(".controlUpdate").bind("click",function () {

            });*/

  			$(".clearEqp").bind("click", function(){
  				var eqpId=$(this).parent().next().children(".eqpIdSpan").text();
  				$.ajax({
				 	   type:"POST",
				 	   url: "clearEqp/"+eqpId,
				 	   success: function(msg){
				 	  	 if(msg==="Y"){
				 	  	 		alert("已经通知清洗");
				 	  	 	}
				 	   }
				 	}); 
  			});
        </script>
</body>
</html>