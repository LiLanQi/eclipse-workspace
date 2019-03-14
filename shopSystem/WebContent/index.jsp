<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>��������</title>
		<link href="${pageContext.request.contextPath }/css/footer.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/amazeui.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/css/vipstyle.css" rel="stylesheet" type="text/css">
		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/amazeui.js"></script>
	</head>

	<body>
		<!--ͷ -->
		<header>
			<article>
				<div class="mt-logo">
					<!--���������� -->
				<%@ include file="nav.jsp" %>

						<!--����������-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="����" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="����" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
		<div class="nav-table">
			<div class="long-title"><span class="all-goods">ȫ������</span></div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="#">��ҳ</a></li>
					<li class="qc"><a href="#">����</a></li>
					<li class="qc"><a href="#">��ʱ��</a></li>
					<li class="qc"><a href="#">�Ź�</a></li>
					<li class="qc last"><a href="#">���װ</a></li>
					<li class="qc last"><a href="studentInfoManage.jsp">�û�����</a></li>
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>�ҵĸ���
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>
		</div>
		<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">
					<div class="wrap-left">
						<div class="wrap-list">
							<div class="m-user">
								<!--������Ϣ -->

								<div class="m-userinfo">
									<a href="news.jsp">
										<div class="tipsBox"><i class="am-icon-envelope"></i></div>
									</a>
									<div class="m-baseinfo">
										<a class="m-pic" href="information.jsp">
											<img src="images/getAvatar.do.jpg">
										</a>
										<div class="m-info">
											<em class="s-name">С����</em>
											<div class="vip1"><a href="#"><span></span><em>��Աר��</em></a></div>
											<div class="safeText"><a href="safety.jsp">�˻���ȫ:<em style="margin-left:20px ;">60</em>��</a>
												<div class="progressBar"><span style="left: -95px;" class="progress"></span></div>
											</div>
											<div class="m-address">
												<a href="address.jsp" class="i-trigger">�ջ���ַ<i class="am-icon-angle-right" style="padding-left:5px ;"></i></a>
											</div>
										</div>
									</div>
									<div class="m-right">
										<div class="m-new">
											<a href="news.jsp"><i class="am-icon-dropbox  am-icon-md" style="padding-right:5px ;"></i>��Ϣ����</a>
										</div>

									</div>
								</div>

								<!--�����ʲ�-->
								<div class="m-userproperty">
									<div class="s-bar">
										<i class="s-icon"></i>�����ʲ�
									</div>
									<p class="m-coupon">
										<a href="coupon.jsp">
											<em class="m-num">2</em>
											<span class="m-title">�Ż�ȯ</span>
										</a>
									</p>
									<p class="m-wallet">
										<a href="wallet.jsp">
											<em class="m-num">0.00</em>
											<span class="m-title">�˻����</span>
										</a>
									</p>
									<p class="m-bill">
										<a href="pointnew.jsp">
											<em class="m-num">10</em>
											<span class="m-title">�ܻ���</span>
										</a>
									</p>
								</div>

								<!--�ҵ�Ǯ��-->
								<div class="wallet">
									<div class="s-bar">
										<i class="s-icon"></i>�̳�Ǯ��
									</div>
									<p class="m-big squareS">
										<a href="#">
											<i><img src="images/shopping.png"/></i>
											<span class="m-title">�ܹ���</span>
										</a>
									</p>
									<p class="m-big squareA">
										<a href="#">
											<i><img src="images/safe.png"/></i>
											<span class="m-title">����ȫ</span>
										</a>
									</p>
									<p class="m-big squareL">
										<a href="#">
											<i><img src="images/profit.png"/></i>
											<span class="m-title">�����</span>
										</a>
									</p>
								</div>

							</div>
							<div class="box-container-bottom"></div>

							<!--���� -->
							<div class="m-order">
								<div class="s-bar">
									<i class="s-icon"></i>�ҵĶ���
									<a class="i-load-more-item-shadow" href="order.jsp">ȫ������</a>
								</div>
								<ul>
									<li><a href="order.jsp"><i><img src="images/pay.png"/></i><span>������</span></a></li>
									<li><a href="order.jsp"><i><img src="images/send.png"/></i><span>������<em class="m-num">1</em></span></a></li>
									<li><a href="order.jsp"><i><img src="images/receive.png"/></i><span>���ջ�</span></a></li>
									<li><a href="order.jsp"><i><img src="images/comment.png"/></i><span>������<em class="m-num">3</em></span></a></li>
									<li><a href="change.jsp"><i><img src="images/refund.png"/></i><span>�˻���</span></a></li>
								</ul>
								<div class="orderContentBox">
									<div class="orderContent">
										<div class="orderContentpic">
											<div class="imgBox">
												<a href="orderinfo.jsp"><img src="images/youzi.jpg"></a>
											</div>
										</div>
										<div class="detailContent">
											<a href="orderinfo.jsp" class="delivery">ǩ��</a>
											<div class="orderID">
												<span class="time">2016-03-09</span>
												<span class="splitBorder">|</span>
												<span class="time">21:52:47</span>
											</div>
											<div class="orderID">
												<span class="num">��1����Ʒ</span>
											</div>
										</div>
										<div class="state">������</div>
										<div class="price"><span class="sym">�0�6</span>23.<span class="sym">80</span></div>

									</div>
									<a href="youzi.jsp" class="btnPay">�ٴι���</a>
								</div>

								<div class="orderContentBox">
									<div class="orderContent">
										<div class="orderContentpic">
											<div class="imgBox">
												<a href="orderinfo.jsp"><img src="images/heart.jpg"></a>
											</div>
										</div>
										<div class="detailContent">
											<a href="orderinfo.jsp" class="delivery">�ɼ�</a>
											<div class="orderID">
												<span class="time">2016-03-09</span>
												<span class="splitBorder">|</span>
												<span class="time">21:52:47</span>
											</div>
											<div class="orderID">
												<span class="num">��2����Ʒ</span>
											</div>
										</div>
										<div class="state">�ѷ���</div>
										<div class="price"><span class="sym">�0�6</span>246.<span class="sym">50</span></div>

									</div>
									<a href="heart.jsp" class="btnPay">�ٴι���</a>
								</div>
							</div>
							<!--�Ź���-->
							<div class="user-squaredIcon">
								<div class="s-bar">
									<i class="s-icon"></i>�ҵĳ���
								</div>
								<ul>
									<a href="order.jsp">
										<li class="am-u-sm-4"><i class="am-icon-truck am-icon-md"></i>
											<p>������ѯ</p>
										</li>
									</a>
									<a href="collection.jsp">
										<li class="am-u-sm-4"><i class="am-icon-heart am-icon-md"></i>
											<p>�ҵ��ղ�</p>
										</li>
									</a>
									<a href="foot.jsp">
										<li class="am-u-sm-4"><i class="am-icon-paw am-icon-md"></i>
											<p>�ҵ��㼣</p>
										</li>
									</a>
									<a href="#">
										<li class="am-u-sm-4"><i class="am-icon-gift am-icon-md"></i>
											<p>Ϊ���Ƽ�</p>
										</li>
									</a>
									<a href="blog.jsp">
										<li class="am-u-sm-4"><i class="am-icon-share-alt am-icon-md"></i>
											<p>�ҵķ���</p>
										</li>
									</a>
									<a href="../home/home2.jsp">
										<li class="am-u-sm-4"><i class="am-icon-clock-o am-icon-md"></i>
											<p>��ʱ�</p>
										</li>
									</a>

								</ul>
							</div>

							<div class="user-suggestion">
								<div class="s-bar">
									<i class="s-icon"></i>��Ա����
								</div>
								<div class="s-bar">
									<a href="suggest.jsp"><i class="s-icon"></i>�������</a>
								</div>
							</div>

							<!--�Ż�ȯ����-->
							<div class="twoTab">
								<div class="twoTabModel Coupon">
									<h5 class="squareTitle"><a href="#"><span class="splitBorder"></span>�Ż�ȯ<i class="am-icon-angle-right"></i></a></h5>
									<div class="Box">
										<div class="CouponList">
											<span class="price">�0�6<strong class="num">50</strong></span>
	                                        <p class="brandName"><a href="#">ABCƷ��499��50</a></p>
	                                        <p class="discount">��<span>499</span>Ԫ�ֿ�</p>
                                            <a  href="#" class="btnReceive">������ȡ</a>
										</div>
									</div>
								</div>
								<div class="twoTabModel credit">
									<h5 class="squareTitle"><a href="#"><span class="splitBorder"></span>�����̳�<i class="am-icon-angle-right"></i></a></h5>
									<div class="Box">
										<p class="countDown">
											<span class="hour">12</span>��<span class="minute">09</span>��<span class="second">02</span><em class="txtStart">������ʼ</em>
										</p>
										<div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth:108, itemMargin:3, slideshow: false}">
											<ul class="am-slides">
												<li><a href="#"><img src="images/333.jpg" /></a></li>
												<li><a href="#"><img src="images/222.jpg" /></a></li>
												<li><a href="#"><img src="images/111.jpg" /></a></li>
												<li><a href="#"><img src="images/333.jpg" /></a></li>
												<li><a href="#"><img src="images/222.jpg" /></a></li>
												<li><a href="#"><img src="images/111.jpg" /></a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>
					<div class="wrap-right">

						<!-- ����-->
						<div class="day-list">
							<div class="s-title">
								ÿ��������
							</div>
							<div class="s-box">
								<ul>
									<li><a><p>���ͳ���� ��128��18</p></a></li>
									<li><a><p>��ɹ��ô��Ҫ������������</p></a></li>
									<li><a><p>���ջ�����Ĥ�����٣���ѡ������</p></a></li>
									<li><a><p>����ʱ�У�Ħ�ǳ��Σ���������</p></a></li>
									<li><a><p>���ͳ���� ��128��18</p></a></li>
									<li><a><p>���ջ�����Ĥ�����٣���ѡ������</p></a></li>									
								</ul>
							</div>
						</div>
						<!--��Ʒ -->
						<div class="new-goods">
							<div class="s-bar">
								<i class="s-icon"></i>������Ʒ
								<a class="i-load-more-item-shadow">15����Ʒ</a>
							</div>
							<div class="new-goods-info">
								<a class="shop-info" href="#">
									<div class="face-img-panel">
										<img src="images/imgsearch1.jpg" alt="">
									</div>
									<span class="new-goods-num ">4</span>
									<span class="shop-title">��������</span>
								</a>
								<a class="follow">�ղ�</a>
							</div>
						</div>						

						<!--�����Ƽ� -->
						<div class="new-goods">
							<div class="s-bar">
								<i class="s-icon"></i>�����Ƽ�
							</div>
							<div class="new-goods-info">
								<a class="shop-info" href="#" target="_blank">
									<div >
										<img src="images/666.jpg" alt="">
									</div>
                                    <span class="one-hot-goods">��189.60</span>
								</a>
							</div>
						</div>						
     				</div>
     				<div class="clear"></div>
     				
     				<!--�ղغ��㼣-->
     				 <div data-am-widget="tabs" class="am-tabs collection">
                         <ul class="am-tabs-nav am-cf">
                         	<li class="am-active"><a href="[data-tab-panel-0]"><i class="am-icon-heart"></i>��Ʒ�ղ�</a></li>
                            <li class=""><a href="[data-tab-panel-1]"><i class="am-icon-paw"></i>�����㼣</a></li>
                        </ul>
                        <div class="am-tabs-bd">

                            <div data-tab-panel-0 class="am-tab-panel am-active">
                        		<div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth:155,slideshow: false}">
									<ul class="am-slides">
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/EZA27501.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/BxJk6.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/youzi.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/EZA27501.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/BxJk6.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/youzi.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>

									</ul>
								</div>
                            </div>
                            <div data-tab-panel-1 class="am-tab-panel "> 
                        		<div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth:155, slideshow: false}">
									<ul class="am-slides">
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/BxJk6.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/youzi.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/EZA27501.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/BxJk6.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/youzi.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="images/EZA27501.jpg" /></a>
                                       	  <strong class="price">�0�632.9</strong>
                                       </li>
									</ul>
								</div>                            	
                            </div>
                        </div>
                     </div>


				</div>
				<!--�ײ�-->
				<div id="footer">
			<div id="links">
				<a href=""> ��������</a>|
				<a href="">��ϵ����</a>|
				<a href="">�˲���Ƹ</a>|
				<a href="">�̼���פ</a>|
				<a href="">������</a>|
				<a href="">��������</a>|
				<a href="">��������</a>|
				<a href="">English Site</a>
			</div>
			<div style="color: #999;">
				Copyright�0�82004-2018&nbsp;&nbsp;&nbsp;��Ȩ����
			</div>
		</div>

			</div>

			<%@ include file="menu.jsp" %>
		</div>
		<!--���� -->
		<div class="navCir">
			<li><a href="../home/home2.jsp"><i class="am-icon-home "></i>��ҳ</a></li>
			<li><a href="../home/sort.jsp"><i class="am-icon-list"></i>����</a></li>
			<li><a href="../home/shopcart.jsp"><i class="am-icon-shopping-basket"></i>���ﳵ</a></li>
			<li class="active"><a href="index.jsp"><i class="am-icon-user"></i>�ҵ�</a></li>
		</div>
	</body>

</html>