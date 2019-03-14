package com.xt.service;

import java.util.List;

import com.xt.dao.OrderDao;
import com.xt.vo.Order;

public class OrderService implements IOrderService {

	OrderDao orderDao=new OrderDao();
	/**
	 * 获取订单列表
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public List<Order> getOrderListByUserIdStatus(String userId, String status) {
		return orderDao.getOrderListByUserIdStatus(userId, status);
	}
	/**
	 * 删除订单
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public int deleteOrderByOrderIdStatuss(String orderId, String status) {
		return orderDao.deleteOrderByOrderIdStatuss(orderId, status);
	}

}
