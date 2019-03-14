package com.xt.userinfo;

/**
 * 用户业务逻辑层接口
 * 
 * @author 李岚祺
 */
public interface IUserInfoService {

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