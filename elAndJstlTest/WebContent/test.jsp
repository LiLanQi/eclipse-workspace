<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="name" items="${requestScope.names }" varStatus="stat">
		${name.key }+${name.value } + ${stat.index };
		<br>
	</c:forEach>
	<br><br><br>
	<c:forEach var="city" items="${requestScope.citys}">
		<c:forEach var="num" items="${city.value }">
			${num };
		</c:forEach>
		<br>
	</c:forEach>
</body>
</html>