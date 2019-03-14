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

	<table>
		<tr>
			<th>商品编号</th><th>商品名称</th><th>商品价格</th><th>商品数量</th>
		</tr>
			<c:set var="sum" value = "0"></c:set>
			<c:forEach var = "good" items="${sessionScope.list }">
			<tr>
				<th>${good.goodsId }</th><th>${good.goodsName}</th><th>${good.goodsPrice}</th><th>${good.goodsNumber}</th>
			</tr>	
				<input type="hidden" value = "${sum = sum + good.goodsPrice*good.goodsNumber}">
			</c:forEach>
		<tr>
			<p>总价：${sum }
		</tr>
			<tr>
				<form action = "myShopMachine" method = "post">
					<input type="hidden" name = "method" value = "add">
					<tr>
						<th>数量</th><th><input type="text" name = "goodsNumber"></th> &nbsp&nbsp <th>商品编码</th><th><input type="text" name = "goodsId"></th>
					</tr>
					<th><input type="submit" value="提交"></th>
				</form>
				<form action = "myShopMachine" method = "post">
					<input type="hidden" name = "method" value = "delete">
					<th><input type="submit" value="结账"></th>
				</form>
			</tr>
		
		
		
	</table>

</body>
</html>