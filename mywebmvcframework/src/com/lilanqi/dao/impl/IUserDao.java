package com.lilanqi.dao.impl;

import com.lilanqi.domain.User;

public interface IUserDao {

	User find(String userName, String passWord);
	
	User find(String userName);
	
	void add(User user);
}
