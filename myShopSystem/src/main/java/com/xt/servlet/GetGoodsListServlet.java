package com.xt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.service.GoodsService;
import com.xt.vo.Goods;

import net.sf.json.JSONArray;

/**
 * 获取商品列表
 *
 *
 * @author 李银霞
 */
@WebServlet("/GetGoodsListServlet")
public class GetGoodsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		System.out.println(type);
		GoodsService goodsService=new GoodsService();
		List<Goods> list=goodsService.getGoodsList(type);
		JSONArray str=JSONArray.fromObject(list);
		System.out.println(str);
		response.getWriter().println(str.toString());
	}

}
