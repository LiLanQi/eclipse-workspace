package com.xt.dao;

import java.util.List;

import com.xt.vo.Order;

/**
 * 订单接口
 *
 *
 * @author 李银霞
 */
public interface IOrderDao {

	/**
	 * 获取用户订单
	 *
	 * @author 李银霞
	 */
	List<Order> getOrderListByUserIdStatus(String userId,String status);
	
	/**
	 * 删除订单
	 *
	 * @author 李银霞
	 */
	int deleteOrderByOrderIdStatuss(String orderId,String status);
}
