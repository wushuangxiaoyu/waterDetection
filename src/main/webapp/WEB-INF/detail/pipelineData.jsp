
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="common/head.jsp"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/detail/css/jquery.cxcalendar.css">
	<!-- end: CSS -->

		<jsp:include page="common/headMenu.jsp"/>

	<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
			<jsp:include page="common/mainMenu.jsp"/>
			<!-- end: Main Menu -->
						
			<!-- start: Content -->
			<div id="content" class="span10" >


			<!--PH-->
			<c:choose>
				<c:when test="${not empty sessionScope.equipment }">
					<c:set var="flag" value="true"/>
					<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
						<c:if test="${eqp.flagPh==1&&flag}">
							<c:set value="false" var="flag"/>

							<div class="row-fluid">
				
				<div class="box span12" id="PH">
					<div class="box-header">
						<h2><i class="icon-edit"></i>PH值</h2>
						<div class="box-icon">
							<a href="" id="btn-setting"><i class="icon-wrench"></i></a>
							<a href="" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div id="MyWizard" class="wizard">
							<div class="actions" style="width: 90%">
								<div style="display: inline;float: left;">
								<span style="font-size: 20px">设备:</span>&nbsp<select id="eqp" class="selectError30" style="width: 80px">
									<c:choose>
							    		<c:when test="${not empty sessionScope.equipment }">
							    			<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
							    				<c:if test="${eqp.waterCondition==1 &&eqp.flagPh==1}">
							    				<option value="${eqp.id}">${eqp.equipmentName }</option>
							    				</c:if>
							    			</c:forEach>
							    		</c:when>
							    		<c:otherwise>
							    		</c:otherwise>
							    	</c:choose>
								</select>
								&nbsp&nbsp
								<span style="font-size: 20px">粒度:</span>&nbsp<select id="lidu" class="selectError30" style="width: 80px">
									<option value="0">小时</option>
									<option value="1">日</option>
									<option value="2">月</option>
								</select>
								&nbsp&nbsp
								<span style="font-size: 20px">统计:</span>&nbsp<select id="tongji" class="selectError30" style="width: 80px;margin-right: 40px;">
									<option>平均值</option>
									<option>最大值</option>
									<option>最小值</option>
								</select>

								<span style="font-size: 20px">起始时间:</span>
								<input class="element_id1" type="text" style="width: 100px">
								<span style="font-size: 20px">结束时间:</span>
								<input class="element_id2" type="text" style="width: 100px">
								</div>
								<div style="display: inline;float: right;">
								<button type="button" class="btn btn-success " data-last="Finish" style="height: 28.4px" id="getPH" >查询<i class="icon-arrow-right"></i></button>
								</div>
							</div>
							
						<!-- 	<a href="#myModal" role="button" class="btn" data-toggle="modal">查看演示案例</a> -->
 
							<!-- Modal -->
							<div id="myModal2" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							  <div class="modal-header">
							    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							    <h3 id="myModalLabel">警告</h3>
							  </div>
							  <div class="modal-body">
							    <p id="modalP"></p>
							  </div>
							  <div class="modal-footer">
							    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
							  </div>
							</div>
							
							
							
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
							
								<br>
								<div id="container" style="min-width:400px;height:400px"></div>
							</div>
						</div>
					</div>	
				</div><!--/span-->
				
			</div><!-- row -->
						</c:if>
					</c:forEach>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>

			<!-- 温度AND溶氧量 -->
			<c:choose>
				<c:when test="${not empty sessionScope.equipment }">
					<c:set var="flag" value="true"/>
					<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
						<c:if test="${eqp.flagTmpOxy==1&&flag}">
							<c:set value="false" var="flag"/>
							<div class="row-fluid">

				<div class="box span12" id="OXY">
					<div class="box-header">
						<h2><i class="icon-edit"></i>温度＆溶氧量</h2>
						<div class="box-icon">
							<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div id="MyWizard" class="wizard">
							<div class="actions" style="width: 90%">
								<div style="display: inline;float: left;">
								<span style="font-size: 20px">设备:</span>&nbsp<select id="eqp" class="selectError30" style="width: 80px">
									<c:choose>
							    		<c:when test="${not empty sessionScope.equipment }">
							    			<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
							    				<c:if test="${eqp.waterCondition==1 &&eqp.flagTmpOxy==1}">
							    				<option value="${eqp.id}">${eqp.equipmentName }</option>
							    				</c:if>
							    			</c:forEach>
							    		</c:when>
							    		<c:otherwise>
							    		</c:otherwise>
							    	</c:choose>
								</select>
								&nbsp&nbsp
								<span style="font-size: 20px">粒度:</span>&nbsp<select id="lidu" class="selectError30" style="width: 80px">
									<option value="0">小时</option>
									<option value="1">日</option>
									<option value="2">月</option>
								</select>
								&nbsp&nbsp
								<span style="font-size: 20px">统计:</span>&nbsp<select id="tongji" class="selectError30" style="width: 80px;margin-right: 40px;">
									<option>平均值</option>
									<option>最大值</option>
									<option>最小值</option>
								</select>

								<span style="font-size: 20px">起始时间:</span>
								<input class="element_id1" type="text" style="width: 100px">
								<span style="font-size: 20px">结束时间:</span>
								<input class="element_id2" type="text" style="width: 100px">
								</div>
								<div style="display: inline;float: right;">
								<button type="button" class="btn btn-success " data-last="Finish" style="height: 28.4px" id="getOxy" >查询<i class="icon-arrow-right"></i></button>
								</div>
							</div>
								
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
								<div id="container2" style="min-width:400px;height:400px"></div>
							</div>
						</div>
					</div>	
				</div><!--/span-->
				
			</div><!--/row-->
						</c:if>
					</c:forEach>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>

			<!-- 氨氮含量 -->
			<c:choose>
				<c:when test="${not empty sessionScope.equipment }">
					<c:set var="flag" value="true"/>
					<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
						<c:if test="${eqp.flagHeavy==1&&flag}">
							<c:set value="false" var="flag"/>
							<div class="row-fluid">

								<div class="box span12" id="HEAVY">
									<div class="box-header">
										<h2><i class="icon-edit"></i>氨氮含量</h2>
										<div class="box-icon">
											<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
											<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
											<a href="#" class="btn-close"><i class="icon-remove"></i></a>
										</div>
									</div>
									<div class="box-content">
										<div id="MyWizard" class="wizard">
											<div class="actions" style="width: 90%">
												<div style="display: inline;float: left;">
													<span style="font-size: 20px">设备:</span>&nbsp<select id="eqp" class="selectError30" style="width: 80px">
													<c:choose>
														<c:when test="${not empty sessionScope.equipment }">
															<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
																<c:if test="${eqp.waterCondition==1 &&eqp.flagHeavy==1}">
																	<option value="${eqp.id}">${eqp.equipmentName }</option>
																</c:if>
															</c:forEach>
														</c:when>
														<c:otherwise>
														</c:otherwise>
													</c:choose>
												</select>
													&nbsp&nbsp
													<span style="font-size: 20px">粒度:</span>&nbsp<select id="lidu" class="selectError30" style="width: 80px">
													<option value="0">小时</option>
													<option value="1">日</option>
													<option value="2">月</option>
												</select>
													&nbsp&nbsp
													<span style="font-size: 20px">统计:</span>&nbsp<select id="tongji" class="selectError30" style="width: 80px;margin-right: 40px;">
													<option>平均值</option>
													<option>最大值</option>
													<option>最小值</option>
												</select>

													<span style="font-size: 20px">起始时间:</span>
													<input class="element_id1" type="text" style="width: 100px">
													<span style="font-size: 20px">结束时间:</span>
													<input class="element_id2" type="text" style="width: 100px">
												</div>
												<div style="display: inline;float: right;">
													<button type="button" class="btn btn-success " data-last="Finish" style="height: 28.4px" id="getHeavy" >查询<i class="icon-arrow-right"></i></button>
												</div>
											</div>

										</div>
										<div class="step-content">
											<div class="step-pane active" id="step1">
												<br/>
												<div id="container3" style="min-width:400px;height:400px"></div>
											</div>
										</div>
									</div>
								</div><!--/span-->

							</div><!--/row-->
						</c:if>
					</c:forEach>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>


			<!-- 磷含量 -->
			<c:choose>
				<c:when test="${not empty sessionScope.equipment }">
					<c:set var="flag" value="true"/>
					<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
						<c:if test="${eqp.flagChy==1&&flag}">
							<c:set value="false" var="flag"/>
							<div class="row-fluid">

								<div class="box span12" id="CHY">
									<div class="box-header">
										<h2><i class="icon-edit"></i>磷含量</h2>
										<div class="box-icon">
											<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
											<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
											<a href="#" class="btn-close"><i class="icon-remove"></i></a>
										</div>
									</div>
									<div class="box-content">
										<div id="MyWizard" class="wizard">
											<div class="actions" style="width: 90%">
												<div style="display: inline;float: left;">
													<span style="font-size: 20px">设备:</span>&nbsp<select id="eqp" class="selectError30" style="width: 80px">
													<c:choose>
														<c:when test="${not empty sessionScope.equipment }">
															<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
																<c:if test="${eqp.waterCondition==1 && eqp.flagChy==1}">
																	<option value="${eqp.id}>${eqp.equipmentName }</option>
																</c:if>
															</c:forEach>
														</c:when>
														<c:otherwise>
														</c:otherwise>
													</c:choose>
												</select>
													&nbsp&nbsp
													<span style="font-size: 20px">粒度:</span>&nbsp<select id="lidu" class="selectError30" style="width: 80px">
													<option value="0">小时</option>
													<option value="1">日</option>
													<option value="2">月</option>
												</select>
													&nbsp&nbsp
													<span style="font-size: 20px">统计:</span>&nbsp<select id="tongji" class="selectError30" style="width: 80px;margin-right: 40px;">
													<option>平均值</option>
													<option>最大值</option>
													<option>最小值</option>
												</select>

													<span style="font-size: 20px">起始时间:</span>
													<input class="element_id1" type="text" style="width: 100px">
													<span style="font-size: 20px">结束时间:</span>
													<input class="element_id2" type="text" style="width: 100px">
												</div>
												<div style="display: inline;float: right;">
													<button type="button" class="btn btn-success " data-last="Finish" style="height: 28.4px" id="getChy" >查询<i class="icon-arrow-right"></i></button>
												</div>
											</div>

										</div>
										<div class="step-content">
											<div class="step-pane active" id="step1">

												<form class="form-horizontal" />
												<span>流水数据</span>
												</form>
												<div id="container4" style="min-width:400px;height:400px"></div>
											</div>
										</div>
									</div>
								</div><!--/span-->

							</div><!--/row-->
						</c:if>
					</c:forEach>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>

			</div>
			<!-- end: Content -->
		</div>		
		
				
		<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			  <div class="modal-header">
			    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			    <h3 id="myModalLabel">对数据有疑问？</h3>
			  </div>
			  <div class="modal-body">
			  	<p>请写下来</p>
			    
			  </div>
			  <div class="modal-footer">
			    <button class="btn" data-dismiss="modal" aria-hidden="true">提交</button>
			  </div>
		</div>

		<div class="clearfix"></div>
		
		<footer>
			<br>
			<br>
			<p style="text-align:center">
				<span style="text-align:center">安徽农业大学 &copy; 2017<a target="_blank" href="#"></a></span>
			</p>

		</footer>
				
	</div><!--/.fluid-container-->

	<!-- start: JavaScript-->
			<script type="${pageContext.request.contextPath }/detail/js/selectData.js"></script>
			<jsp:include page="common/js.jsp"/>
			<script src="${pageContext.request.contextPath }/detail/js/jquery.cxcalendar.min.js"></script>
			<script type="text/javascript">
				$(".element_id1").cxCalendar();
				$(".element_id2").cxCalendar();
			</script>
			<script src="https://img.hcharts.cn/highstock/highstock.js"></script>
			<script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
			<!-- <!-- <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script> --> -->
			<script src="${pageContext.request.contextPath }/detail/js/highcharts-zh_CN.js"></script>
			<script src="${pageContext.request.contextPath }/detail/js/pipelineData_highChart.js"></script>
	</body>
</html>