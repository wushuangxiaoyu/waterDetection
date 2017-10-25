$("#userName").blur(function(){
				var a=$("#userName").val();
				if(a===""){
					$("#userName_span").text("用户名不能为空");				
				}else{
					$("#userName_span").text("");	
				}
			});
			$("#password").blur(function(){
				var a=$("#password").val();
				if(a===""){
					$("#psd_span").text("密码不能为空");				
				}
				else{
					$("#psd_span").text("");	
				}
			});
			$("form :button").click(function(){
				var name=$("#userName").val();
				var psd=$("#password").val();
				
				if(name===""){
					$("#psd_span").text("密码不能为空");				
				}
				else if(psd===""){
					$("#psd_span").text("密码不能为空");				
				}
				else{
					//登陆验证
					$.ajax({
						   type: "POST",
						   url: "user/login",
						   data: "userName="+name+"&password="+psd,
						   success: function(msg){
						     if(msg==="Y"){
						    	 window.location.href="/pipelineData"
						     }
						     else{
						    	 $("#psd_span").text("用户名或密码错误");
						     }
						   }
					});
				} 
			});