<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import= "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% 
           List<String>list = new ArrayList<String>(); 
           list.add(0, "贝贝"); 
           list.add(1, "晶晶"); 
           list.add(2, "欢欢"); 
           list.add(3, "莹莹"); 
           list.add(4, "妮妮"); 
           request.setAttribute("list", list); 
    	%>
    	<c:forEach items="${list }" var = "person">
    		<c:out value="${person }"></c:out><br>
    	</c:forEach>
	</body>
</html>