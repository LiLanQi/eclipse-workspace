package com.lilanqi.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lilanqi.message.ResMessage;
import com.lilanqi.order.OrderItem;
import com.lilanqi.service.OrderService;

@WebServlet("/ShowGoodsAjax.do")
public class ShowGoodsAjaxServlet extends HttpServlet{
	
	private OrderService os  = new OrderService();

	public void service(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html; charset=UTF-8");
		String barCode  = request.getParameter("barCode");
		try {
			ResMessage rm = new ResMessage();
			OrderItem oi = os.getOrderItemByBarcode(barCode);
			if(oi != null) {
				rm.setResCode(1);
				rm.setData(oi);
			} else {
				rm.setResCode(0);
				rm.setResMsg("此商品不存在");
			}
			String msg = new Gson().toJson(rm);
			System.out.println("========>>" + msg);
			response.getWriter().write(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
