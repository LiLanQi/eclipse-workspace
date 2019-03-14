<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.Person" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setAttribute("name", "李岚祺");
		%>
		${name };
		<hr>
		<%
			Person person = new Person();
			person.setAge("20");
			request.setAttribute("person", person);
		%>
		${person.age }
		
		<%
			Person person2 = new Person();
			person2.setAge("30");
			List<Person> list = new ArrayList();
			list.add(person);
			list.add(person2);
			request.setAttribute("list", list);
		%>
		<hr>
		${list[1].age };
		<hr>
		<c:forEach var="per" items="${list }" >
			<c:out value = "${per.age }"></c:out>
		</c:forEach>
	</body>
</html>