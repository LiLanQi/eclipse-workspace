<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String ctxPath = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>学生信息管理</h3>
		<hr>
		<form action="<%=ctxPath %>/stuAdd" method = "post">
			<table>
				<tr>
					<td>学生编号：</td><td><input type="text" name="stuNo"></td>
				</tr>
				<tr>
					<td>学生姓名：</td><td><input type="text" name="stuName"></td>
				</tr>
				<tr>
					<td>性别：</td><td> <label><input type="radio" name="gender" value="0">女</label> <label><input type="radio" name="gender" value="1">男</label></td>
				</tr>
				<tr>
					<td>年龄：</td><td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>分数：</td><td><input type="text" name="score"></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交">  </td><td><input type="reset" value="重置"></td>
				</tr>
			
			</table>
			
		</form>
	</div>

</body>
</html>