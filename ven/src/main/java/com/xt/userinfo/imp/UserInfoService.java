package com.xt.userinfo.imp;

import com.xt.userinfo.IUserInfoDao;
import com.xt.userinfo.IUserInfoService;

/**
 * 用户业务逻辑层接口实现类
 * 
 * @author 李岚祺
 */
public class UserInfoService implements IUserInfoService {

	private IUserInfoDao userInfoDao = new UserInfoDao();
	
	/**
	 * 实现依据用户名和密码登陆抽象方法
	 * 
	 * @author 李岚祺
	 */
	public boolean login(String username, String password) {
		return userInfoDao.login(username, password);
	}

	/**
	 * 实现依据用户名和密码注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	public boolean register(String username, String password) {
		return userInfoDao.register(username, password);
	}
}