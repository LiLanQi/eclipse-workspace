package com.xt.service;

import java.util.List;

import com.xt.vo.Goods;

public interface IGoodsService{

	/**
	 * 获取商品列表
	 *
	 * @author 李银霞
	 */
	List<Goods> getGoodsList(String type);
	
	/**
	 * 添加商品
	 *
	 * @author 李银霞
	 */
	boolean insert (String type,Goods goods);

	/**
	 * 从商品Id获取这个商品信息接口
	 *
	 * @author 李银霞
	 */
	Goods getGoodsById(String goodsId);
	
	/**
	 * 更新商品接口方法
	 *
	 * @author 李银霞
	 */
	boolean updateGoodsById(Goods goods) ;
	
	/**
	 * 删除商品方法
	 *
	 * @author 李银霞
	 */
	boolean deleteGoodsById(String goodsId);
}
