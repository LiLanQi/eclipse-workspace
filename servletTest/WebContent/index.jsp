<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="/fym" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		你的ip地址是（使用java代码获取输出)
		<%
			String ip = request.getRemoteAddr();
			out.write(ip);
		%>
		<hr/>
		你的IP地址是(使用自定义标签获取输出)
		<f:ViewIP/>
	</body>
</html>