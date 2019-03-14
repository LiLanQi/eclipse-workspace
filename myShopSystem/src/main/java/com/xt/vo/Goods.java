package com.xt.vo;

/**
 * 商品类
 *
 *
 * @author 李银霞
 */
public class Goods {

	private String goodsId;
	private String goodsName;
	private float unitPrice;
	private String address;
	private int stock;
	private int saleVolume;
	private int evaluateNum;
	private String imgAdd;
	
	
	public String getImgAdd() {
		return imgAdd;
	}
	public void setImgAdd(String imgAdd) {
		this.imgAdd = imgAdd;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSaleVolume() {
		return saleVolume;
	}
	public void setSaleVolume(int saleVolume) {
		this.saleVolume = saleVolume;
	}
	public int getEvaluateNum() {
		return evaluateNum;
	}
	public void setEvaluateNum(int evaluateNum) {
		this.evaluateNum = evaluateNum;
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", unitPrice=" + unitPrice + ", address="
				+ address + ", stock=" + stock + ", saleVolume=" + saleVolume + ", evaluateNum=" + evaluateNum
				+ ", imgAdd=" + imgAdd + "]";
	}
}
