package com.lilanqi.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.lilanqi.goods.Goods;
import com.lilanqi.order.OrderItem;
import com.lilanqi.util.DBUtil;

public class GoodsDao {
	
	private QueryRunner qr = new QueryRunner(DBUtil.getDruidDataSource());

	public Goods getGoodsByBarCode(String barCode) throws SQLException {
		String sql = "select id, bar_code barCode, goods_name goodsName, price, type from goods where bar_code = '"+barCode+"'";
		System.out.println("sql = " + sql);
		return qr.query(sql, new BeanHandler<Goods>(Goods.class));
	}
	
	/*public void deleteGoodsByBarCode(String barCode) throws SQLException {
		String sql = "delete from goods where bar_code = '"+barCode+"' ";
		System.out.println(sql);
		qr.update(sql);
	}*/
	
	public void paymentItem(OrderItem oi) throws SQLException {
		String sql = "insert into t_order(bar_code, goods_name, price, goods_count) values ('"+oi.getBarCode()+"' , '"+oi.getGoodsName()+"' , "+oi.getPrice()+" , "+oi.getGoodsCount()+")";
		System.out.println(sql);
		qr.update(sql);
	}
}
