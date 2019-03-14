package com.xt.common;

public class ShopCard {

	private int shopcard_id;
	private int goods_id;
	private int user_id;
	private int shopcard_num;
	private double shopcard_price;
	public int getShopcard_id() {
		return shopcard_id;
	}
	public void setShopcard_id(int shopcard_id) {
		this.shopcard_id = shopcard_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getShopcard_num() {
		return shopcard_num;
	}
	public void setShopcard_num(int shopcard_num) {
		this.shopcard_num = shopcard_num;
	}
	public double getShopcard_price() {
		return shopcard_price;
	}
	public void setShopcard_price(double shopcard_price) {
		this.shopcard_price = shopcard_price;
	}
	@Override
	public String toString() {
		return "ShopCard [shopcard_id=" + shopcard_id + ", goods_id=" + goods_id + ", user_id=" + user_id
				+ ", shopcard_num=" + shopcard_num + ", shopcard_price=" + shopcard_price + "]";
	}
	
	
	
}
