package com.xt.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.xt.util.DBUtil;
import com.xt.vo.Goods;
/**
 * 关于商品dao层
 *
 * @author 李银霞
 */
public class GoodsDao implements IGoodsDao {

	DBUtil dbutil=new DBUtil();
	Connection connection=dbutil.getConnection();
	

	/**
	 * 获取商品方法
	 *
	 * @author 李银霞
	 */
	@Override
	public List<Goods> getGoodsList(String type) {
		QueryRunner qr=new QueryRunner();
		List<Goods> list=new ArrayList();
		String sql=null;
		if(!type.equals("null")) {
			sql="select goods_id goodsId,goods_name goodsName,unit_price unitPrice,address,stock,evaluate_num evaluateNum,sale_volume saleVolume,img_add imgAdd from "+type;
		
		try {
			return qr.query(connection, sql,  new BeanListHandler<Goods>(Goods.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}else {
			String[] goods={"clothes","foods","application"};
			for (int i = 0; i < goods.length; i++) {
				sql="select goods_id goodsId,goods_name goodsName,unit_price unitPrice,address,stock,evaluate_num evaluateNum,sale_volume saleVolume,img_add imgAdd from "+goods[i];
				System.out.println(sql);
				List<Goods> tempList=null;
				try {
					tempList = qr.query(connection, sql,  new BeanListHandler<Goods>(Goods.class));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				list.addAll(tempList);
			}
			return list;
		}
		return null;
	}


	/**
	 * 添加商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public boolean insert(String type, Goods goods) {
		String sql="insert into "+type+"(goods_id,goods_name,unit_price,address,stock,img_add) values(?,?,?,?,?,?)";
		System.out.println(sql);
		QueryRunner qr=new QueryRunner();
		Object[] param= {goods.getGoodsId(),goods.getGoodsName(),goods.getUnitPrice(),goods.getAddress(),goods.getStock(),goods.getImgAdd()};
		try {
			int row=qr.update(connection, sql, param);
			if(row!=0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 从商品ID获取商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public Goods getGoodsById(String goodsId) {
		QueryRunner qr=new QueryRunner();
		String[] goods={"clothes","foods","application"};
		for (String tempGoods : goods) {
			String sql="select goods_id goodsId,goods_name goodsName,unit_price unitPrice,address,stock,evaluate_num evaluateNum,sale_volume saleVolume,img_add imgAdd  from "+tempGoods+" where goods_id="+goodsId;
			System.out.println("更新时获得商品信息"+sql);
			try {
				Goods updateGoods=qr.query(connection, sql, new BeanHandler<Goods>(Goods.class));
				if(updateGoods!=null) {
					return updateGoods;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}


	/**
	 * 更新商品方法
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public boolean updateGoodsById(Goods goods) {
		QueryRunner qr=new QueryRunner();
		String[] tableName={"clothes","foods","application"};
		for (String tempGoods : tableName) {
			String sql="update "+tempGoods+" set goods_name=?,unit_price=?,address=?,stock=?,img_add=? where goods_id=?";

			Object[] params = {goods.getGoodsName(),goods.getUnitPrice(),goods.getAddress(),goods.getStock(),goods.getImgAdd(),goods.getGoodsId()};
			try {
				int row=qr.update(connection, sql,params);
				if(row>0) {
					System.out.println("更新成功");
					return true;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * 删除商品
	 *
	 *
	 * @author 李银霞
	 */
	@Override
	public boolean deleteGoodsById(String goodsId) {
		QueryRunner qr=new QueryRunner();
		String[] tableName={"clothes","foods","application"};
		for (String string : tableName) {
			String sql="delete from "+string+" where goods_id="+goodsId;
			System.out.println("删除sql语句"+sql);
			try {
				int row=qr.update(connection, sql);
				if(row>0) {
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
