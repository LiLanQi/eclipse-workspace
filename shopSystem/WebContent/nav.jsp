<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<div class="am-container header">
				<ul class="message-l">
					<div class="topMessage">
						<div class="menu-hd">
							<c:if test="${userName == null}">
								<a href="login.jsp" target="_top" class="h">亲，请登录</a>
								<a href="register.jsp" target="_top">免费注册</a>
							</c:if>
							<c:if test="${userName != null}">
								<a href="information.jsp" target="_top" class="h">${userName}你好！</a>
							</c:if>
						</div>
					</div>
				</ul>
				<ul class="message-r">
					<div class="topMessage home">
						<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
					</div>
					<div class="topMessage my-shangcheng">
						<div class="menu-hd MyShangcheng">
							<c:if test="${userName != null}">
								<a href="information.jsp " target="_top">
							</c:if>
							<c:if test="${userName == null}">
								<a id="mc-menu-hd" href="login.jsp" target="_top">
							</c:if>
							<i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
					</div>
					<div class="topMessage mini-cart">
						<div class="menu-hd">
						<c:if test="${userName != null}">
							<a id="mc-menu-hd" href="load.shopCard" target="_top">
						</c:if>
						<c:if test="${userName == null}">
							<a id="mc-menu-hd" href="login.jsp" target="_top">
						</c:if>
						<i class="am-icon-shopping-cart  am-icon-fw"></i>
						<span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
					</div>
					<div class="topMessage favorite">
						<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
					</div>
				</ul>
				</div>