<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div align = "center">
			<h3>用户信息录入</h3>
			<hr>
			<form action = "<%=path%>/userServlet" method = "post">
				<table>
					<input type="hidden" name = "method" value = "add">
					<tr><th>用户ID</th><th><input name = "userId"></th></tr>
					<tr><th>登陆账号</th><th><input name = "loginName"></th></tr>
					<tr><th>用户昵称</th><th><input name = "userName"></th></tr>
					<tr><th>用户类型</th><th><input name = "userType"></th></tr>
					<tr><th>用户邮箱</th><th><input name = "email"></th></tr>
					<tr><th>手机号码</th><th><input name = "phonenumber"></th></tr>
					<tr><th>用户性别</th><th><input name = "sex"></th></tr>
					<tr><th>密码</th><th><input name = "password"></th></tr>
					<tr><th>账号状态</th><th><input name = "status"></th></tr>
					<tr><th>删除标志</th><th><input name = "delFlag"></th></tr>
					<tr><th>备注</th><th><textarea rows="10" cols="30" name = "remark"></textarea></th></tr>
					<tr><th><input type = "submit"></th><th><input type = "reset"></th></tr>
				</table>
			</form>
		</div>
	</body>
</html>