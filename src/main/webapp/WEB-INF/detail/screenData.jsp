<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:include page="common/head.jsp"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/detail/css/jquery.cxcalendar.css">
	<link href="${pageContext.request.contextPath }/detail/css/jquery.dataTables.min.css" rel="stylesheet" />
	<!-- end: CSS -->

		<jsp:include page="common/headMenu.jsp"/>


<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
			<jsp:include page="common/mainMenu.jsp"/>
			<!-- end: Main Menu -->
						
			<!-- start: Content -->
			<div id="content" class="span10" style="min-height: 1000px">
			
			<!-- 数据总览 -->
			<div class="row-fluid">
				
				<div class="box span12" id="screenDataTable" >
					<div class="box-header">
						<h2><i class="icon-edit"></i>数据总览</h2>
						<div class="box-icon">
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content" style="min-height:600px">
						<div id="MyWizard" class="wizard">
							<!-- 设备时间选择 -->
						<div class="actions" style="width: 90%">
							<div style="display: inline;float: left;">
								<span style="font-size: 20px">设备:</span>&nbsp
									
								<select id="eqp" class="selectError30" style="width: 80px">
									<c:choose>
							    		<c:when test="${not empty sessionScope.equipment }">
							    			<c:forEach  var="eqp" items="${sessionScope.equipment}" varStatus="i">
							    				<c:if test="${eqp.waterCondition==1}">
							    				<option value="${eqp.id}">${eqp.equipmentName }</option>
							    				</c:if>
							    			</c:forEach>
							    		</c:when>
							    		<c:otherwise>
							    		</c:otherwise>
							    	</c:choose>
								</select>
								
								
								&nbsp&nbsp
								<%--<span style="font-size: 20px">统计:</span>&nbsp<select id="tongji" class="selectError30" style="width: 80px;margin-right: 40px;">
									<option>平均值</option>
									<option>最大值</option>
									<option>最小值</option>
								</select>--%>

								<span style="font-size: 20px">日期</span>
								<input id="element_tableStart" type="text" style="width: 100px">
								&nbsp&nbsp
								
							</div>
							<!-- 设备时间选择结束 -->
								<div style="display: inline;float: right;">
								<button type="button" class="btn btn-success btn-next" data-last="Finish" id="getTableData">查询 <i class="icon-arrow-right"></i></button>
								</div>									
							</div>
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
							<br>
								<!-- 表格 -->
								<table id="tableData1" class="display" cellspacing="0" width="90%" style="text-align: center;" >
								        <thead>
								            <tr>
								                <th style="width: 30% ">时间</th>
								                <th>PH</th>
								                <th>温度(°C)</th>
								                <th>含氧量(mg/L)</th>
												<th>氨氮含量(mg/L)</th>
												<th>磷含量(mg/L)</th>
								            </tr>
								        </thead>
								    </table>
								<!-- 表格结束 -->
							</div>
						</div>
					</div>	
				</div><!--/span-->
			</div><!--/row-->
					
		    </div>
			<!-- end: Content -->
				
		</div><!--/fluid-row-->
				
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
		<!-- Modal结束 -->
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
		<%-- <script src="${pageContext.request.contextPath }/detail/js/jquery-1.10.2.min.js"></script> --%>
		<jsp:include page="common/js.jsp"/>
	<!-- 	<script src="https://img.hcharts.cn/highstock/highstock.js"></script>
		<script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script> -->
		<!-- <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script> -->
		<script src="${pageContext.request.contextPath }/detail/js/screenData_highChart.js"></script>
		<script src="${pageContext.request.contextPath }/detail/js/jquery.cxcalendar.min.js"></script>
		<script type="text/javascript">
			$(" #element_tableStart").cxCalendar();
		</script>
	<!-- end: JavaScript-->
	
</body>
</html>