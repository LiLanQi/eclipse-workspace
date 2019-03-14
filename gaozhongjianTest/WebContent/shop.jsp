<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.it.db.server.Shop" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<style>
	form{
		display: block;
	}
		.wai{
			margin: 0px 166px;
			height: 500px;
			width: 1000px;
			border: 1px solid black;
		}
		.li1{
			margin: 5px;
			height: 400px;
			border: 1px solid black;
		}
		.jin{
			float: right;
			height: 50px;
			line-height: 50px;
		}
		.jin:after{
			content:' ';
			display: block;
			clear: right;
		}
		form:after{
		content:' ';
			display: block;
			clear: both;
		}
	</style>
	<body>
		<h2 align="center">超市收银系统</h2>
		<div class="wai">
			<div class="li1">
				<table style="margin-top: 10px;" align="center" border="0px" cellspacing="0px" width="95%">
					<tr>
						<th>商品编号</th><th>商品名称</th><th>商品价格</th><th>商品数量</th>
					</tr>
					<c:set var="sum" value="0.00"></c:set>
					<c:forEach var="shop" items="${goodsList}">
						<tr align="center">
							<td>${shop.goodsId}</td><td>${shop.goodsName}</td>
							<td>${shop.price}</td><td>${shop.num}</td>
						</tr>
						<input type="hidden" value="${sum=sum+shop.price*shop.num}">
					</c:forEach>
				</table>
			</div>
			<div class="jin">
				<div style="width: 200px;">总金额：<fmt:formatNumber type="number" value="${sum}" pattern="0.00"></fmt:formatNumber></div>
			</div>
			<div style="clear: right;"></div>
			<form style="width: 800px; float: left;" action="shop.do" method="post">
				<input type="hidden" name="mn" value="add">
					数量：<input style="margin-right: 100px;" type="text" name="num" value=""/>
					商品编码：<input type="text" name="goodsId" value="" />
					<input style="margin-left: 130px;" type="submit" value="提交" />
			</form>
			<form style="width: 180px;float: right;" action="shop.do" method="post">
					<c:set var="jiezhang" value="${sum}" scope="session"></c:set>
					<input type="hidden" name="mn" value="remove">
					<input style="margin-left: 50px;" type="submit" value="结账" />
			</form>
		</div>
	</body>
</html>
