package com.xt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.service.GoodsService;

/**
 * Servlet implementation class DoDeleteGoodsServlet
 */
@WebServlet("/DoDeleteGoodsServlet")
public class DoDeleteGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoDeleteGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goodsId=request.getParameter("goodsId");
		System.out.println("删除商品编号"+goodsId);
		GoodsService goodsService=new GoodsService();
		boolean flag=goodsService.deleteGoodsById(goodsId);
		if(flag==true) {
			response.sendRedirect("goods/search.jsp");
		}else {
			request.getRequestDispatcher("UpdateGoodsByIdServlet?goodsId="+goodsId).forward(request, response);
		}
	}

}
