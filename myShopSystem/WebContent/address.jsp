<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>地址管理</title>

		<link href="${pageContext.request.contextPath }/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${pageContext.request.contextPath }/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/addstyle.css" rel="stylesheet" type="text/css">
		<script src="${pageContext.request.contextPath }/js/jquery.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/js/amazeui.js"></script>

	</head>
	<script>
		$(function(e){
			$("#store").click(function(){
				var nameValue = $("input[name='name']").val();
				var phoneValue = $("input[name='phone']").val();
				var addressValue = $(".am-form-content").find("option:selected").text();
				var detailAddressValue = $("textarea[name='detailaddress']").val();
				alert(nameValue+phoneValue+addressValue+detailAddressValue);
				$.ajax({
					type:"post",
					url:"add.address",
					data:{name:nameValue,phone:phoneValue,address:addressValue,detailaddress:detailAddressValue},
					dataType:"json",
					success:function(resdata){	
						//$("ul").append("<li class='user-addresslist'><span class='new-option-r'><i class='am-icon-check-circle'></i>设为默认</span><p class='new-tit new-p-re'><span class='new-txt'>"+resdata.name+"</span><span class='new-txt-rd2'>"+resdata.phone+"</span></p><div class='new-mu_l2a new-p-re'><p class='new-mu_l2cw'><span class='title'>地址：</span><span class='province'>"+resdata.province+"</span>省<span class='city'>"+resdata.city+"</span>市<span class='dist'>洪山</span>区<span class='street'>"+resdata.detailAddress+"</span></p></div><div class='new-addr-btn'><a href='#'><i class='am-icon-edit'></i>编辑</a><span class='new-addr-bar'>|</span><a href='javascript:void(0);' onclick='delClick("+resdata.id+");'><i class='am-icon-trash'></i>删除</a></div></li>");
							window.location="findAll.address";
						
					}
				})
			})
		})
		
		function delClick(id){
			alert(id);
			$.ajax({
				type:"post",
				url:"delete.address",
				data:{"id":id},
				dataType:"json",
				success:function(resdata){	
					//$("ul").append("<li class='user-addresslist'><span class='new-option-r'><i class='am-icon-check-circle'></i>设为默认</span><p class='new-tit new-p-re'><span class='new-txt'>"+resdata.name+"</span><span class='new-txt-rd2'>"+resdata.phone+"</span></p><div class='new-mu_l2a new-p-re'><p class='new-mu_l2cw'><span class='title'>地址：</span><span class='province'>"+resdata.province+"</span>省<span class='city'>"+resdata.city+"</span>市<span class='dist'>洪山</span>区<span class='street'>"+resdata.detailAddress+"</span></p></div><div class='new-addr-btn'><a href='#'><i class='am-icon-edit'></i>编辑</a><span class='new-addr-bar'>|</span><a href='javascript:void(0);' onclick='delClick("+resdata.id+");'><i class='am-icon-trash'></i>删除</a></div></li>");
						
					
					if(resdata == true){
						
						window.location="findAll.address";
					}else{
						alert("异常");
					}
					
				}
			});
			
		}
	</script>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
						<%@ include file="nav.jsp" %>
						<!--悬浮搜索框-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>

		<div class="nav-table">
			<div class="long-title"><span class="all-goods">全部分类</span></div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="#">首页</a></li>
					<li class="qc"><a href="#">闪购</a></li>
					<li class="qc"><a href="#">限时抢</a></li>
					<li class="qc"><a href="#">团购</a></li>
					<li class="qc last"><a href="#">大包装</a></li>
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>
		</div>
		<b class="line"></b>

		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-address">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">地址管理</strong> / <small>Address&nbsp;list</small></div>
						</div>
						<hr/>
						
						<c:forEach items="${requestScope.addressDetailList}" var="addressDetail">
						
						
								<ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails" style="float: left;">
		
									<li class="user-addresslist defaultAddr">
										<span class="new-option-r"><i class="am-icon-check-circle"></i>默认地址</span>
										<p class="new-tit new-p-re">
											<span class="new-txt">${addressDetail.name}</span>
											<span class="new-txt-rd2">${addressDetail.phone}</span>
										</p>
										<div class="new-mu_l2a new-p-re">
											<p class="new-mu_l2cw">
												<span class="title">地址：</span>
												<span class="province">${addressDetail.province}</span>省
												<span class="city">${addressDetail.city}</span>市
												<span class="dist">${addressDetail.area}</span>区
												<span class="street">${addressDetail.detailAddress}</span></p>
										</div>
										<div class="new-addr-btn">
											<!-- <a href="#"><i class="am-icon-edit"></i>编辑</a>
											<span class="new-addr-bar">|</span> -->
											<a href="javascript:void(0);" onclick="delClick('${addressDetail.id}');"><i class="am-icon-trash"></i>删除</a>
										</div>
									</li>
								</ul>
						</c:forEach>
						<div class="clear"></div>
						<a class="new-abtn-type" data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
						<!--例子-->
						<div class="am-modal am-modal-no-btn" id="doc-modal-1">

							<div class="add-dress">

								<!--标题 -->
								<div class="am-cf am-padding">
									<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add&nbsp;address</small></div>
								</div>
								<hr/>

								<div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
									<form class="am-form am-form-horizontal">

										<div class="am-form-group">
											<label for="user-name" class="am-form-label">收货人</label>
											<div class="am-form-content">
												<input type="text" id="user-name" name="name" placeholder="收货人">
											</div>
										</div>

										<div class="am-form-group">
											<label for="user-phone" class="am-form-label">手机号码</label>
											<div class="am-form-content">
												<input id="user-phone" placeholder="手机号必填" name="phone" type="email">
											</div>
										</div>
										<div class="am-form-group">
											<label for="user-address" class="am-form-label">所在地</label>
											<div class="am-form-content address">
												<select data-am-selected >
													<option value="a">浙江省</option>
													<option value="b" selected>湖北省</option>
												</select>
												<select data-am-selected >
													<option value="a">温州市</option>
													<option value="b" selected>武汉市</option>
												</select>
												<select data-am-selected >
													<option value="a">瑞安区</option>
													<option value="b" selected>洪山区</option>
												</select>
											</div>
										</div>

										<div class="am-form-group">
											<label for="user-intro" class="am-form-label">详细地址</label>
											<div class="am-form-content">
												<textarea name="detailaddress" class="" rows="3" id="user-intro" placeholder="输入详细地址"></textarea>
												<small>100字以内写出你的详细地址...</small>
											</div>
										</div>

										<div class="am-form-group">
											<div class="am-u-sm-9 am-u-sm-push-3">
												<a class="am-btn am-btn-danger" id="store">保存</a>
												<a href="javascript: void(0)" class="am-close am-btn am-btn-danger" data-am-modal-close>取消</a>
											</div>
										</div>
									</form>
								</div>

							</div>

						</div>

					</div>

					<script type="text/javascript">
						$(document).ready(function() {							
							$(".new-option-r").click(function() {
								$(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
							});
							
							var $ww = $(window).width();
							if($ww>640) {
								$("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
							}
							
						})
					</script>

					<div class="clear"></div>

				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
						</p>
					</div>
				</div>
			</div>
				<%@ include file="menu.jsp" %>
			
		</div>

	</body>

</html>