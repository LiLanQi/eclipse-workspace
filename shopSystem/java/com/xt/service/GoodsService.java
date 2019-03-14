package com.xt.service;

import java.util.List;

import com.xt.dao.GoodsDao;
import com.xt.vo.Goods;

public class GoodsService implements IGoodsService {

	private GoodsDao goodsDao=new GoodsDao();
	/**
	 * 获取商品列表Servlet级
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public List<Goods> getGoodsList(String type) {
		return goodsDao.getGoodsList(type);
	}

	/**
	 * 添加商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public boolean insert(String type, Goods goods) {
		return goodsDao.insert(type, goods);
	}

	/**
	 * 从商品Id更新商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public Goods getGoodsById(String goodsId) {
		// TODO Auto-generated method stub
		return goodsDao.getGoodsById(goodsId);
	}

	/**
	 * 更新商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public boolean updateGoodsById(Goods goods) {
		return goodsDao.updateGoodsById(goods);
	}

	/**
	 * 删除商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public boolean deleteGoodsById(String goodsId) {
		return goodsDao.deleteGoodsById(goodsId);
	}

}
