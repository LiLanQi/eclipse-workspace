package com.xt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.service.GoodsService;
import com.xt.service.OrderService;
import com.xt.vo.Goods;


@WebServlet("/UpdateGoodsByIdServlet")
public class UpdateGoodsByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goodsId=request.getParameter("goodsId");
		GoodsService goodsService=new GoodsService();
		Goods goods=goodsService.getGoodsById(goodsId);
	/*	JSONObject json = JSONObject.fromObject(goods);
		System.out.println(json);
		response.getWriter().println(json.toString());*/
		request.setAttribute("updateGoods", goods);
		request.getRequestDispatcher("goods/goodsUpdate.jsp").forward(request, response);
	}
}
