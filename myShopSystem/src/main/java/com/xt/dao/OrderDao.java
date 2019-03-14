package com.xt.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xt.util.DBUtil;
import com.xt.vo.Goods;
import com.xt.vo.Order;

public class OrderDao implements IOrderDao {

	Connection connection=DBUtil.getConnection();
	/**
	 * 获取订单
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public List<Order> getOrderListByUserIdStatus(String userId, String status) {
		QueryRunner qr=new QueryRunner();
		String sql1="select order_id orderId,goods_name goodsName,unit_price unitPrice,goods_num goodsNum,img_add imgAdd,order_time orderTime,user_id userId,status status from user_order where user_id='"+userId+"'";
		String sql="select order_id orderId,goods_name goodsName,unit_price unitPrice,goods_num goodsNum,img_add imgAdd,order_time orderTime ,user_id userId,status status from user_order where user_id='"+userId+"' and status="+status;
		try {
			if(status.equals("4")) {
				System.out.println("不需要状态sql语句："+sql1);
				return qr.query(connection, sql1,new BeanListHandler<Order>(Order.class));
			}else {
				System.out.println("需要状态sql语句："+sql);
				return qr.query(connection, sql,new BeanListHandler<Order>(Order.class));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int deleteOrderByOrderIdStatuss(String orderId, String status) {
		String sql="delete from user_order where user_id='"+orderId+"' and status="+status;
		System.out.println(sql);
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(connection, sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
