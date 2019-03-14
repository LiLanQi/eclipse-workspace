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
			<c:catch var = "errorInfo">
				<c:set target="person" property="name" value = "lilanqi"/>
			</c:catch>
			异常:${errorInfo }<br>
			errorInfo.gertMessage:<c:out value = "${errorInfo.message }"></c:out><br>
			errorInfo.gertCause:<c:out value = "${errorInfo.cause }"></c:out><br>
			errorInfo.gertStackTrace:<c:out value = "${errorInfo.stackTrace }"></c:out><br>
			<c:out value = "lilanqi"></c:out>
		</ul>
		
	</body>
</html>