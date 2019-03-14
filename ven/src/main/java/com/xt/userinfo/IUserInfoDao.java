package com.xt.userinfo;

/**
 * 用户数据访问接口
 * 
 * @author 李岚祺
 */
public interface IUserInfoDao {

	/**
	 * 依据用户名和密码登陆抽象方法
	 * 
	 * @author 李岚祺
	 */
	boolean login(String username,String password);
	
	/**
	 * 依据用户名和密码注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	boolean register(String username,String password);
}