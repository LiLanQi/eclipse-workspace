package com.xt.service;

import java.sql.Timestamp;
import java.util.List;

import com.xt.common.User;

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
	List<User> loginById(String userName,String password);
	List<User> loginByEmail(String userName, String password);
	List<User> loginByMobile(String userName, String password);
	
	/**
	 * 依据密码和手机号注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	boolean registerByPhone(String password, String phone, String code);
	
	/**
	 * 依据密码和邮箱注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	boolean registerByEmail(String password, String email);
	
	void updateUserInformation(String id, String tempName, String realName, int sex, Timestamp date, String email, String phone);
	
	void updataAddressInformation(String id, String name, String phone, String address, String detailAddress,int user_info_id);
}
