<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	pageContext.setAttribute("msg", "jstl获取的Value");
%>
<body>
	<c:out value = "hello world"></c:out><br>
	<c:out value="${msgs}" default = "李岚祺" ></c:out>
	<c:set var="msg" value="cset设置的" scope="page"></c:set>
	<c:out value = "${msg }"></c:out>
	<c:remove var="msg"/>
	${msg }
	<h4>c:if标签：</h4>
	<br>
	<c:if test="true">
		hello c:if
	</c:if>
	<c:if test="${3>4 }">
		hello c:idid
	</c:if>
	<br>
	<c:choose>
		<c:when test="${3>4 }">
			3<4
		</c:when>
		<c:otherwise>
			3>4
		</c:otherwise>
	</c:choose>
	<br>
	
	<table>
		<tr>
			<th>学生编号<th><th>姓名</th><th>性别</th><th>年龄</th><th>分数</th><th>序号</th>
		</tr>
		<c:forEach var="stu" items="${list }" varStatus="e" begin="1" end="9" step="2">
			<tr>
				<th>${stu.stuNo}<th><th>${stu.stuName}</th><th>${stu.gender==0?"男":"女"}</th><th>${stu.age}</th><th>${stu.score}</th><th>${e.index }</th>
			</tr>
		</c:forEach>
	</table>
	<c:if test="true" var = "fengyuming">
		woaini
	</c:if>
	${fengyuming };
</body>
</html>