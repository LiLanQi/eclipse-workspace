package com.xt.vo;


public class Order {

	private String OrderId;
	private String goodsName;
	private float unitPrice;
	private int goodsNum;
	private String imgAdd;
	private String orderTime;
	private String userId;
	private int status;
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getImgAdd() {
		return imgAdd;
	}
	public void setImgAdd(String imgAdd) {
		this.imgAdd = imgAdd;
	}
	public String getOrderTime() {
		return orderTime.toString();
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
