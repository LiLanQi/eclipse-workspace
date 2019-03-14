<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<ul>
			<c:set var = "name" value = "lilanqi" scope = "session"></c:set>
			<c:set var = "sex" scope = "session">男</c:set>
			<li><c:out value = "${sessionScope.name }"></c:out></li>
			<li><c:out value = "${sessionScope.sex }"></c:out></li>
			
			<hr>
			
			<c:remove var="sex"/>
			<li><c:out value = "${sessionScope.name }"></c:out></li>
			<li><c:out value = "${sessionScope.sex }"></c:out></li>
		</ul>
	</body>
</html>