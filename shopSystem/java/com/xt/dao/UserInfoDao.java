package com.xt.dao;

import org.apache.commons.dbutils.QueryRunner;

import com.xt.impl.IUserInfoDao;
import com.xt.util.DBUtil;

public class UserInfoDao implements IUserInfoDao{

	private QueryRunner qr = new QueryRunner(DBUtil.getDruidDataSource());
	
	@Override
	public boolean login(String userName, String password) {
		String sql = "select id userName, password from user_info where userName = '"+userName+"' and password = '"+password+"'";
		
		return false;
	}

}
