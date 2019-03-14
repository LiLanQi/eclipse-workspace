package com.it.db.server;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.it.db.common.DbUtil;

public class ShopDao {
	
	private QueryRunner qr = null;
	
	public void init() {
		qr = new QueryRunner(DbUtil.getDataSource());
	}

	public Shop addGood(Shop shops){
		init();
		String sql = "select * from goods where goodsId=?";
		List<Shop> shop = null;
		try {
			shop = qr.query(sql, new BeanListHandler<Shop>(Shop.class), shops.getGoodsId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shop.get(0);
	}
}
