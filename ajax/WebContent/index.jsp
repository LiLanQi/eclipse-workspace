<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<script type="text/javascript">
		var xhr = null;
		try{
			xhr = new XMLHttpRequest();
		}catch(e){
			try{
			 	xhr = new ActiveXObject("Msxml2.XMLHTTP");
			}catch(e){
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		//get方式提交数据
		function checkUser(usernameInput) {
			var reqUrl = "${pageContext.request.contextPath}/checkUserName?username="+usernameInput.value;
			alert(usernameInput.nextSibling);
			xhr.open("get", reqUrl, true);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var respText = xhr.responseText;
					usernameInput.nextSibling.innerHTML = respText;
				}
			}
			xhr.send();
		}
		
		function checkUserByPost(userNameInput) {
			var reqUrl = "${pageContext.request.contextPath}/checkUserName";
			var param = "username=" + userNameInput.value;
			xhr.open("post", reqUrl, true);
			xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					/* var respText = xhr.responseText;
					userNameInput.nextSibling.innerHTML = respText; */
					var MSG = JSON.parse(xhr.responseText);
					alert(MSG);
					userNameInput.nextSibling.innerHTML = MSG.msg;
				}
			}
			xhr.send(param);
		}
		
		
	</script>
	<body>
		<div align="center">
		<form action="" method = "post">
			用户名：<input type="text" name="username" onchange="checkUserByPost(this)"><span></span><br>
			密码：<input type="password" name="password"><br>
			<input type="submit" value="注册">
		</form>
	</div>
	</body>
</html>