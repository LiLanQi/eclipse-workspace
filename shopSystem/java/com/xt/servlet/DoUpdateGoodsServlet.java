package com.xt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.service.GoodsService;
import com.xt.util.WebUtil;
import com.xt.vo.Goods;

@WebServlet("/DoUpdateGoodsServlet")
public class DoUpdateGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Class clazz=Goods.class;
		Object obj;
		try {
			obj = clazz.newInstance();
			WebUtil.param2Bean(request,obj);
			Goods goods=(Goods)obj;
			GoodsService goodsService=new GoodsService();
			boolean flag=goodsService.updateGoodsById(goods);
			if(flag==true) {
				response.sendRedirect("goods/search.jsp");
			}else {
				request.getRequestDispatcher("UpdateGoodsByIdServlet?goodsId="+goods.getGoodsId()).forward(request, response);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
