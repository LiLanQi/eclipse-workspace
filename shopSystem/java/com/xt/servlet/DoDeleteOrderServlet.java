package com.xt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.service.OrderService;


@WebServlet("/DoDeleteOrderServlet")
public class DoDeleteOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	OrderService orderService=new OrderService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String orderId=request.getParameter("orderId");
		String status=request.getParameter("status");
		System.out.println(orderId+":"+status);

		int mark=orderService.deleteOrderByOrderIdStatuss(orderId, status);
		if(mark>0) {
			PrintWriter out=response.getWriter();
			out.print("$('#waitPay').trigger('click')");
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/order/orderList.jsp");
			dispatcher.forward(request, response);
		}
	}
}
