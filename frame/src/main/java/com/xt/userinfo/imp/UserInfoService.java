package com.xt.userinfo.imp;

import com.xt.userinfo.IUserInfoDao;
import com.xt.userinfo.IUserInfoService;

public class UserInfoService implements IUserInfoService{

	private IUserInfoDao UserInfoDao = new UserInfoDao();
	
	@Override
	public boolean login(String userName, String password) {

		return UserInfoDao.login(userName, password);
	}
}