<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title></title>
		<script type="text/javascript" src="./js/jquery-3.3.1.js"></script>
		<script>
			function sendcode(){
				var ajaxObject={
					url:"./SendcodeServlet",
					type:"GET",
					data:{
						mobile:document.getElementById("mobile").value,
					},
					dataType:"text",
					success:function(data){						
					}
				}
				$.ajax(ajaxObject);
			}
			function checkcode(){
				var ajaxObject={
					url:"./CheckcodeServlet",
					type:"GET",
					data:{mobile:document.getElementById("mobile").value,
						  code:document.getElementById("code").value
						 },
					dataType:"text",
					success:function(data){						
					}
				}
				$.ajax(ajaxObject);
			}

		</script>
	</head>
	<body>
		<input name="mobile" id="mobile" placeholder="请输入手机号" value=""/><br />
		<input name="code" id="code" placeholder="请输入验证码" value=""/><br />
		<button  onclick="sendcode()">发送验证码</button>
		<button  onclick="checkcode()">提交</button>
	</body>
</html>
