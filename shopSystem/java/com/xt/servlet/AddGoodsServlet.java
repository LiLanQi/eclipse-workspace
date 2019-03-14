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

@WebServlet("/AddGoodsServlet")
public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String type=request.getParameter("type");
			System.out.println(type);
		try {
				Class clazz=Goods.class;
				Object obj=clazz.newInstance();
				WebUtil.param2Bean(request,obj);
				Goods goods=(Goods)obj;
				System.out.println(goods);
				GoodsService goodsService=new GoodsService();
				if(goodsService.insert(type, goods)) {
					response.sendRedirect(request.getContextPath()+"/goods/search.jsp");
				}else {
					
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
	}
}
