package com.lilanqi.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lilanqi.message.ResMessage;
import com.lilanqi.order.OrderItem;
import com.lilanqi.service.OrderService;

@WebServlet("/ShowGoodsAjax1.do")
public class ShowGoodsAjaxServlet1 extends HttpServlet{

	OrderService os = new OrderService();
	
	public void Service(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		String barCode = request.getParameter("barCode");
		OrderItem oi = os.getOrderItemByBarcode(barCode);
		ResMessage rs = new ResMessage();
		if (oi != null) {
			rs.setResCode(1);
			rs.setData(oi);
		} else {
			rs.setResCode(0);
			rs.setResMsg("不存在此商品");
		}
		response.getWriter().write(new Gson().toJson(rs));
	}
}
