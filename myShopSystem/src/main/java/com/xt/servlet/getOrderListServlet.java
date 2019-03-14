package com.xt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.service.OrderService;
import com.xt.vo.Order;

import net.sf.json.JSONArray;

@WebServlet("/getOrderListServlet")
public class getOrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	OrderService orderService=new OrderService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId=request.getParameter("userId");
		String status=request.getParameter("status");
		System.out.println(userId+":"+status);
		List<Order> orderList=orderService.getOrderListByUserIdStatus(userId, status);
		System.out.println("订单长度"+orderList.size());
		JSONArray str=JSONArray.fromObject(orderList);
		System.out.println(str);
		response.getWriter().println(str.toString());
	}

}
