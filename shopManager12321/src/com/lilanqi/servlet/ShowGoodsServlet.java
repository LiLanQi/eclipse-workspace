package com.lilanqi.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lilanqi.order.OrderItem;
import com.lilanqi.service.OrderService;
@WebServlet("/showGoods.do")
public class ShowGoodsServlet extends BaseServlet{

	private OrderService os  = new OrderService();
	
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		BigDecimal sum;
		Integer rs  = 0;
		List<OrderItem> li = null;
		Map<String, BigDecimal> map = null;
		
		String barCode  = request.getParameter("barCode");
		String goodsCount = request.getParameter("goodsCount");
		if (barCode != null && !"".equals(barCode)) {
			rs = Integer.parseInt(goodsCount);
		} else {
			rs = 1;
		}
		
		Object o = request.getSession().getAttribute("orderItemList");
		Object ob = request.getSession().getAttribute("sum");
		Object obj = request.getSession().getAttribute("map");
		
		if (o != null ) {
			li = (List<OrderItem>) o;
		} else {
			li = new LinkedList<OrderItem>();
		}
		if (ob != null) {
			sum = (BigDecimal) ob;
		} else {
			sum = BigDecimal.valueOf(0.00);
		}
		if (obj != null) {
			map = (Map<String, BigDecimal>) obj;
		} else {
			map = new HashMap<String, BigDecimal>();
		}
		if(map.get(barCode) != null) {
			for (OrderItem orderItem : li) {
				if (orderItem.getBarCode().equals(barCode)) {
					orderItem.setGoodsCount(rs + orderItem.getGoodsCount());
					sum = sum.add(orderItem.getPrice().multiply(BigDecimal.valueOf(rs)));
					break;
				} 
			}
		} else {
			try {
				OrderItem oi = os.getOrderItemByBarcode(barCode);
				sum = sum.add(oi.getPrice().multiply(BigDecimal.valueOf(rs)));
				oi.setGoodsCount(rs);
				li.add(oi);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		map.put(barCode, sum);
		request.getSession().setAttribute("orderItemList", li);
		request.getSession().setAttribute("sum", sum);
		request.getSession().setAttribute("map", map);
		request.getRequestDispatcher("jsp/showGoods.jsp").forward(request, response);
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int k = 0;
		String barCode = request.getParameter("barCode");
		BigDecimal sum = (BigDecimal) request.getSession().getAttribute("sum");
		List<OrderItem> li =  (List<OrderItem>) request.getSession().getAttribute("orderItemList");
		Map<String, String> mp = (Map<String, String>) request.getSession().getAttribute("map");
		for (OrderItem orderItem : li) {
			if (orderItem.getBarCode().equals(barCode)) {
				sum = sum.subtract(BigDecimal.valueOf(orderItem.getGoodsCount()).multiply(orderItem.getPrice()));
				li.remove(k);
				break;
			} 
			k++;
		}
		mp.remove(barCode);
		request.getSession().setAttribute("map", mp);
		request.getSession().setAttribute("sum", sum);
		request.getRequestDispatcher("jsp/showGoods.jsp").forward(request, response);
	}
}
