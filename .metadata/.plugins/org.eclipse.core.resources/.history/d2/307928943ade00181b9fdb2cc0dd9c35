<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" width="50%" style="margin-top: 200px;">
	<tr>
		<td>商品</td><td>价格</td><td>数量</td>
	</tr>
	<c:forEach var="shop" items="${alist}">
		<tr>
			<td>${shop.goodsName}</td><td>${shop.price}</td><td>${shop.num}</td>
		</tr>
	</c:forEach>
	<tr align="right" style="height: 80px">
		<td>总金额</td><td><fmt:formatNumber type="number" value="${jiezhang}" pattern="0.00"></fmt:formatNumber></td>
	</tr>
	<c:remove var="jiezhang"/>
	<c:remove var="goodsList"/>
	<c:remove var="alist"/>
	<c:remove var="list"/>
</table>
</body>
</html>