<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
						<h2><i class="icon-edit"></i>消息中心</h2>
						<div class="box-icon">
							<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div id="MyWizard" class="wizard">
							<div class="actions">
								<button type="button" class="btn btn-prev"> <i class="icon-arrow-left"></i> Prev</button>
								<button type="button" class="btn btn-success btn-next" data-last="Finish">Next <i class="icon-arrow-right"></i></button>
							</div>
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
								<form class="form-horizontal" />
								<span>个人信息</span>
								</form>
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


</body>
</html>