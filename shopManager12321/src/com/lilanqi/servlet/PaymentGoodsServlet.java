package com.lilanqi.servlet;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lilanqi.order.OrderItem;
import com.lilanqi.service.OrderService;

@WebServlet("/paymentGoods.do")
public class PaymentGoodsServlet extends BaseServlet{
	
	private OrderService os  = new OrderService();
	
	public void change(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<OrderItem> list = (List<OrderItem>) request.getSession().getAttribute("orderItemList");
		for (OrderItem orderItem : list) {
			os.paymentItem(orderItem);
		}
		request.getSession().removeAttribute("orderItemList");
		request.getSession().removeAttribute("sum");
		request.getRequestDispatcher("jsp/showGoods.jsp").forward(request, response);
	}
}
