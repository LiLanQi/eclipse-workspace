package com.lilanqi.service;

import java.sql.SQLException;

import org.apache.commons.beanutils.BeanUtils;

import com.lilanqi.dao.GoodsDao;
import com.lilanqi.goods.Goods;
import com.lilanqi.order.OrderItem;

public class OrderService {

	private GoodsDao gd = new GoodsDao();
	
	public OrderItem getOrderItemByBarcode(String barCode) throws Exception {
		OrderItem oi = null;
		Goods goods = gd.getGoodsByBarCode(barCode);
		if(goods != null) {
			System.out.println(goods.toString());
			oi = new OrderItem();
			BeanUtils.copyProperties(oi, goods);
			System.out.println(oi.toString());
		}
		return oi;
	}
	
/*	public void deleteOrderItemByBarcode(String barCode) throws SQLException {
		gd.deleteGoodsByBarCode(barCode);
	}*/
	
	public void paymentItem(OrderItem oi) throws SQLException {
		gd.paymentItem(oi);
	}
}
