<%@ page language="java" import="java.util.*"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/simpletag" prefix="llq"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		李岚祺牛逼
		<llq:demo5 count="3">
			<h1>count测试</h1>
		</llq:demo5>
		<llq:demo6 date="<%= new Date() %>"/>
		<llq:demo1>
			李岚祺很牛逼
		</llq:demo1>
		<br>
		<llq:demo4/>
		<llq:demo2>
			李岚祺非常牛逼
		</llq:demo2>
		<br>
		<llq:demo3>
			llqniubi
		</llq:demo3>
	</body>
</html>