<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:out value="李岚祺"/>
		<c:out value="下面的代码演示了c:out的使用，以及在不同属性状态下的结果"></c:out>
		<hr>
		<ul>
			<li><c:out value = "JSTL的out标签的使用"></c:out></li>
			<li><c:out value ="<a href='http://www.cnblogs.com'>点击连接到博客园</a>"></c:out></li>
			<li><c:out value ="<a href='http://www.cnblogs.com'>点击连接到博客园</a>" escapeXml="false"></c:out></li>
			<li><c:out value = "&lt未使用字符转义&gt"></c:out></li>
			<li><c:out value = "&lt使用字符转义&gt" escapeXml="false"></c:out></li>
			<li><c:out value="${null }"></c:out></li>
			<li><c:out value="${null }">使用了默认值</c:out></li>
			<li><c:out value="${null }" default = "默认值"></c:out></li>
		</ul>
	</body>
</html>