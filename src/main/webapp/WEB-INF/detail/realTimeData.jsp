<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:include page="common/head.jsp"/>
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
						<h2><i class="icon-edit"></i>实时监控</h2>
						<div class="box-icon">
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<br><br>
						<div class="step-content">
							<div class="step-pane active" id="step1">

								<div style="display: inline;float: left;">
								<span style="font-size: 20px">设备:</span>&nbsp
									<select id="eqp" class="selectError30" style="width: 60px">
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
								<span style="font-size: 20px">值:</span>&nbsp
									<select id="lidu" class="selectError30" style="width: 100px">
									</select>
								&nbsp
								</div>
								<!--图表  -->
								<div id="container1" ></div>
								<br><br>
							</div>
						</div>
					</div>
				</div><!--/span-->
			</div><!--/row-->


		   
		    </div>
			<!-- end: Content -->
				
		</div><!--/fluid-row-->
				
		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>对数据有疑问？</h3>
			</div>
			<div class="modal-body">
				<p>请在这里记录</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">退出</a>
				<a href="#" class="btn btn-primary">提交</a>
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

<!--start: JavaScript-->
	<jsp:include page="common/js.jsp"/>
	<script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
	<script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
	<script src="${pageContext.request.contextPath }/detail/js/highcharts-zh_CN.js"></script>
	<script src="${pageContext.request.contextPath }/detail/js/realTimeData_highChart.js"></script>
	<!-- end: JavaScript-->
</body>
</html>