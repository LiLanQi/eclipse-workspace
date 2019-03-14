package com.it.db.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.it.db.common.BaseServlet;

@WebServlet("/shop.do")
public class ShopServlet extends BaseServlet {

	private static final long serialVersionUID = -215574398345717068L;
	
	List<Shop> list=new ArrayList<Shop>();

	public void add(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		Shop shop = new Shop();
		Map<String, String[]> map = request.getParameterMap();
		try {
			BeanUtils.populate(shop, map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		ShopDao sd = new ShopDao();
		Shop sp = sd.addGood(shop);
		int flag=0;
		for(int i=0;i<list.size();i++) {
			Shop s = list.get(i);
			if(s.getGoodsId().equals(request.getParameter("goodsId"))) {
				flag=1;
				System.out.println(s.getNum());
				s.setNum(s.getNum()+Integer.parseInt(request.getParameter("num")));
				break;
			}
		}
		if(flag==0) {
			sp.setNum(Integer.parseInt(request.getParameter("num")));
			list.add(sp);
		}
		HttpSession session = request.getSession();
		session.setAttribute("goodsList", list);
		try {
			request.getRequestDispatcher("shop.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void remove(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<Shop> al=new ArrayList<>();
		al.addAll(list);
		list.clear();
		HttpSession session = request.getSession();
		session.setAttribute("alist", al);
		request.getRequestDispatcher("check.jsp").forward(request, response);
	}
}
