package com.xt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xt.common.ShopCard;
import com.xt.util.DBUtil;

public class ShopCardDao {

	public List<ShopCard> findAllShopCardByUserId(int userId){
		List<ShopCard> shopCardList = new ArrayList<>();
		
		Connection con = DBUtil.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from shopcard where user_id = ?");
			
			ps.setInt(1, userId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				ShopCard shopCard = new ShopCard();
				int shopcard_id = rs.getInt("shopcard_id");
				int goods_id = rs.getInt("goods_id");
				int user_id = rs.getInt("user_id");
				int shopcard_num =rs.getInt("shopcard_num");
				double shopcard_price =rs.getDouble("shopcard_price");
				
				shopCard.setShopcard_id(shopcard_id);
				shopCard.setGoods_id(goods_id);
				shopCard.setUser_id(user_id);
				shopCard.setShopcard_num(shopcard_num);
				shopCard.setShopcard_price(shopcard_price);
				shopCardList.add(shopCard);
			}
			return shopCardList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return shopCardList;
	}
}
