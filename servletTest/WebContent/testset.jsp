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
		<h3>代码给出了指定scope范围赋值的实例</h3>
		<ul>
			<li><c:set var = "data1" value = "lilanqi" scope = "page"></c:set></li>
			<li>${pageScope.data1 }</li><br>
			<li>${data1 }</li>
			<li><c:set var = "data2" value = "lilanqi" scope = "request"></c:set></li>
			<li>${requestScope.data2 }</li><br>
			<li><c:set var = "data3" value = "lilanqi" scope = "session"></c:set></li>
			<li>${sessionScope.data3 }</li><br>
			<li><c:set var = "data4" value = "lilanqi" scope = "application"></c:set></li>
			<li><c:out value = "${applicationScope.data4 }"></c:out></li><br>
		</ul>
		<hr/>
		<jsp:userBean id = "person" class = "domain.Person">
		<c:set value = "李岚祺 " target="${person }" property="name"></c:set>
		<c:set value = "20 " target="${person }" property="age"></c:set>
		<c:set target="${person }" property="sex">男</c:set>
		<c:set target="${person }" property="home">China</c:set>
		<ul>
			<li>${person }</li>
			<li><c:out value = "${person.name }"></c:out></li>
			<li><c:out value = "${person.age }"></c:out></li>
			<li><c:out value = "${person.sex }"></c:out></li>
			<li><c:out value = "${person.home }"></c:out></li>
		</ul>
	</body>
</html>