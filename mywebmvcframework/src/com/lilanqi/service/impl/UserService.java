package com.lilanqi.service.impl;

import com.lilanqi.dao.UserDao;
import com.lilanqi.dao.impl.IUserDao;
import com.lilanqi.domain.User;
import com.lilanqi.exception.UserExistException;
import com.lilanqi.service.IUserService;

public class UserService implements IUserService{
	
	private IUserDao userDao = new UserDao();

	public void registerUser(User user) throws UserExistException {
		if (userDao.find(user.getUserName())!=null) {
			//checked exception 
			//unchecked exception
			//这里抛编译时异常的原因：是我想上一层程序处理这个异常，以给用户一个友好提示
			throw new UserExistException("注册的用户名已存在！！！");
		}
		userDao.add(user);
	}

	@Override
	public User loginUser(String userName, String userPwd) {
		return userDao.find(userName, userPwd);
	}

}
