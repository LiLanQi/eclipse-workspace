package com.xt.service;

import com.xt.dao.UserInfoDao;
import com.xt.impl.IUserInfoDao;
import com.xt.impl.IUserInfoService;

public class UserInfoService implements IUserInfoService{

	private IUserInfoDao UserInfoDao = new UserInfoDao();

	@Override
	public boolean login(String userName, String password) {
		return UserInfoDao.login(userName, password);
	}
	
}
