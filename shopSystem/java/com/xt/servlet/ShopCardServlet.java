package com.xt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xt.common.ShopCard;
import com.xt.dao.ShopCardDao;


/**
 * Servlet implementation class ShopCardServlet
 */

public class ShopCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String path = request.getServletPath();
			
			
			request.setCharacterEncoding("utf-8");
			System.out.println(path);
			if("/load.shopCard".equals(path)) {
				HttpSession session = request.getSession();
				int userId = (int)session.getAttribute("userName");
				//int userId = 1;
				ShopCardDao shopCardDao = new ShopCardDao();
				List<ShopCard>  shopCardList = shopCardDao.findAllShopCardByUserId(userId);
				
				System.out.println(shopCardList);
				request.setAttribute("shopCardList", shopCardList);
				request.getRequestDispatcher("shopcart.jsp").forward(request, response);;
			
				
				
			}
			
			if("/delete.shopCard".equals(path)) {
				
				
			}
		
		
		
	}

	
	
  

}
