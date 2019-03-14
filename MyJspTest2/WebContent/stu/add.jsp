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
			<h3>学生信息录入</h3>
			<hr>
			<table>
				<form action="<%=path %>/stuServlet" method = "post">
					<input type = "hidden" name = "method" value = "add">
					<tr>
						<td>学号</td><td><input name = "stuNo"></td>
					</tr>
					<tr>
						<td>姓名</td><td><input name = "stuName"></td>
					</tr>
					<tr>
						<td>性别</td><td><input name = "gender"></td>
					</tr>
					<tr>
						<td>年龄</td><td><input name = "age"></td>
					</tr>
					<tr>
						<td>分数</td><td><input name = "score"></td>
					</tr>
					<tr>
						<td><input type = "submit">提交</td><td><input type = "reset">重置</td>
					</tr>
				</form>
			</table>
		</div>
	</body>
</html>