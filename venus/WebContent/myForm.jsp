<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath }/fym" method = "post">
			用户名:<input type = "text" name = "username"><br>
			密码:<input type = "password" name = "password"><br>
			性别:<input type = "radio" name = "sex" value = "男" checked>男
			<input type = "radio" name = "sex" value = "女" checked>女<br>
			部门:<select name = "dept">
				<option value = "技术部">技术部</option>
				<option value = "销售部">销售部</option>
				<option value = "财务部">财务部</option>
			</select><br>
			兴趣:<input type = "checkbox" name = "inst" value = "唱歌">唱歌
			<input type = "checkbox" name = "inst" value = "跳舞">跳舞
			<input type = "checkbox" name = "inse" value = "吉他">吉他
			<input type = "checkbox" name = "inse" value = "编程">编程
			<br>
			自我介绍:<textarea name = "note" rows="5" cols="34"></textarea><br>
			<input type = "submit" value = "提交">
			<input type = "reset" value = "重置">
		</form>
	</body>
</html>