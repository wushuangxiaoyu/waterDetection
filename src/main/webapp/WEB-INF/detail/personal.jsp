<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="common/head.jsp"/>
<link href="${pageContext.request.contextPath }/detail/css/knowledge.css" rel="stylesheet" />
<!-- end: CSS -->


<!-- start: Header -->
<jsp:include page="common/headMenu.jsp"/>
<!--end:Header-->

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
				<h2><i class="icon-edit"></i>个人信息</h2>
				<div class="box-icon">
					<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
					<a href="#" class="btn-close"><i class="icon-remove"></i></a>
				</div>
			</div>
			<div class="box-content" style="height:800px">
				<div class="step-pane active" id="step1">
					<form class="form-horizontal" />
					<span><h3 style="display: block;margin-left: 20px ;color:blue">欢迎进入个人信息中心</h3></span>
					</form>
				</div>
				<div class="span10 offset1" style="margin-top:30px"><img src="img/water2.jpeg"/></div>
				<div class="span8 offset2">
					<div class="span4 offset4" style="margin-top: 30px"><h1><strong>About&nbsp&nbspMe</strong></h1></div>
					<div class="span5 offset3"><h3 style="color:#f60"><strong>I&nbsp am&nbsp browing&nbsp personal&nbsp information</strong></h3></div>
				</div>
				<div class="row">
					<div class="offset3 span2">
						<button class="btn  btn-inverse btn-large"  id="change"style="margin-top: 50px;">&nbsp   修 改 密 码   &nbsp</button>
						<button class="btn  btn-inverse btn-large"  id="set_telephone"style="margin-top: 100px;">绑定电话号码</button>
					</div>
					<div class="offset1 span6"  id="chan_password" style="margin-top:50px;" >
						<form class="form-horizontal" role="form" >
							<div class="form-group">
								<div style="margin-bottom:20px;">
									<label>请输入旧密码：</label>
									<input  type="password" id="password1" >
									<br>
									<span id="old_psd_span" style="color:#FF0000;font-size:10px;margin:20px 0px 0px 60px;">旧密码不能为空</span>
									<br>
								</div>
								<div  style="margin-bottom: 20px;">
									<label>请输入新密码：</label>
									<input type="password" id="password2" >
									<br>
									<span id="new1_psd_span" style="color:#FF0000;font-size:10px;margin:20px 0px 0px 60px;">新密码不能为空</span>
									<br>
								</div>

								<div  style="margin-bottom: 20px;">
									<label>请确认新密码：</label>
									<input type="password" id="password3" >
									<br>
									<span id="new2_psd_span" style="color:#FF0000;font-size:10px;margin:20px 0px 0px 60px;">确认密码不能为空</span>
									<br>
								</div>
								<input type="button"  class="sign-in btn-info " id="ok" value="确认" >
								<input type="reset"  data-remodal-action="cancel" class="sign-in btn-info" id="no" value="取消" >
							</div>
						</form>
					</div>
					<div class="offset1 span6"  id="set_phone" style="margin-top:40px;" >
						<form class="form-horizontal" role="form" >
							<div class="form-group">
								<div style="margin-bottom:30px;margin-top:50px;">
									<label>请输入电话号码</label>
									<input  type="text" id="phone" >
									<br>
									<span id="phone_null" style="color:#FF0000;font-size:10px;margin:20px 0px 0px 60px;">电话号码不存在</span>
									<span id="phone_null1" style="color:#FF0000;font-size:10px;margin:20px 0px 0px 60px;">电话号码不能为空</span>
									<br>
								</div>
								<input type="button"  class="sign-in btn-info " id="ok_phone" value="确认绑定" >
								<input type="reset"  data-remodal-action="cancel" class="sign-in btn-info" id="no_phone" value="取消" >
							</div>
						</form>
					</div>
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
<script>
    $("#set_phone").hide();
    $("#old_psd_span").hide();
    $("#new1_psd_span").hide();
    $("#new2_psd_span").hide();
</script>
<script>
    $(document).ready(
        function(){
            $("#change").click(
                function(){
                    $("#chan_password").show();
                    $("#set_phone").hide();
                }
            );
        }
    );
</script>
<script>
    $(document).ready(
        function(){
            $("#set_telephone").click(
                function(){
                    $("#chan_password").hide();
                    $("#set_phone").show();
                    $("#phone_null").hide();
                    $("#phone_null1").hide();
                }
            );
        }
    );
</script>
<script>

    $("#password1").blur(function(){
        var pass1=$("#password1").val();
        if(!pass1)
        {
            $("#old_psd_span").show();
        }else
        {
            $("#old_psd_span").hide();
        }
    });
    $("#password2").blur(function(){
        var pass2=$("#password2").val();
        if(!pass2)
        {
            $("#new1_psd_span").show();
        }else
        {
            $("#new1_psd_span").hide();
        }
    });
    $("#password3").blur(function(){
        var pass3=$("#password3").val();
        if(!pass3)
        {
            $("#new2_psd_span").show();
        }else
        {
            $("#new2_psd_span").hide();
        }
    });
    $("#ok").click(function(){
        var pass1=$("#password1").val();
        var pass2=$("#password2").val();
        var pass3=$("#password3").val();
        if(!pass1)
        {
            $("#old_psd_span").show();
        }
        if(!pass2)
        {
            $("#new1_psd_span").show();
        }
        if(!pass3)
        {
            $("#new2_psd_span").show();
        }
        if( pass2 == pass3&&pass1&&pass2&&pass3)
        {alert("修改密码成功！");
            $("#chan_password").hide();}
        else if(pass1&&pass2&&pass3)
        {alert("新密码与确认密码不一致，请重新输入！");
        }
    });
    $("#no").click(function(){
        $("#chan_password").hide();
    });
</script>
<script>
    $("#ok_phone").click(function(){
        var phone1=$("#phone").val();
        if(!phone1)
        {
            $("#phone_null1").show();
            $("#phone_null").hide();
        }
        else if(phone1.length!=11)
        {
            $("#phone_null").show();
            $("#phone_null1").hide();
        }
        else
        {
            alert("绑定号码成功！");
            $("#phone_null1").hide();
            $("#phone_null").hide();
        }
    });
    $("#no_phone").click(function(){
        $("#set_phone").hide();
    });
</script>
<!--end:script-->
	
</body>
</html>