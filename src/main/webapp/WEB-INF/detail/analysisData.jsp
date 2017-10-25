<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:include page="common/head.jsp"/>

	<!-- end: CSS -->

	<jsp:include page="common/headMenu.jsp"/>
	
	<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
			<jsp:include page="common/mainMenu.jsp"/>
			<!-- end: Main Menu -->
						
			<!-- start: Content -->
			<div id="content" class="span10" style="min-height: 1000px">
			
			
			<div class="row-fluid" style="min-height: 700px" >
				
				<div class="box span12">
					<div class="box-header">
						<h2><i class="icon-edit"></i>数据分析</h2>
						<div class="box-icon">
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<!-- 近30天 -->
						<span style="font-size: 20px">设备:</span>&nbsp
									
								<select id="eqp_pie" class="selectError30" style="width: 80px">
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
						<div id="MyWizard" class="wizard">		
								<br><h2>近30天</h2>
						</div>
						<div class="step-content">
							<div class="step-pane active"  style="width: 80%">
								<div class="row">
								<div id="pie1" class="span4" style="width: 300px;height:200px;float: left"></div>
								<div id="pie2" class="span4" style="width: 300px;height:200px;float: left"></div>
								<div id="pie3" class="span4" style="width: 300px;height:200px;float: left"></div>
								<div id="pie4" class="span4" style="width: 300px;height:200px;float: left"></div>
								<div id="pie5" class="span4" style="width: 300px;height:200px;float: left"></div>
								</div>
							</div>
							<br>
							<br>
						</div>
						<!-- 近一个月结束 -->
						<!-- 近一年 -->
						
						<div id="MyWizard" class="wizard">
									
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
							
							</div>
						</div>
						<!-- 近一年结束 -->	
					</div>	
				</div><!--/span-->
			</div><!--/row-->			
		    </div>
			<!-- end: Content -->
				
		</div><!--/fluid-row-->
				
		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
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
		<jsp:include page="common/js.jsp"/>
		<script src="${pageContext.request.contextPath }/detail/js/analysisData_highChart.js"></script>
		<script src="${pageContext.request.contextPath }/detail/js/echarts.min.js"></script>
</body>
</html>