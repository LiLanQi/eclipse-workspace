<%@ page language="java" contentType="text/html; charset=UTF-8"
    errorPage = "/error.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//这行代码一定出错，因为除数是0，一运行就会抛出异常
			int x = 1 / 0;
		%>
	</body>
</html>