package com.lilanqi.service;

import com.lilanqi.domain.User;
import com.lilanqi.exception.UserExistException;

public interface IUserService {

	void registerUser(User user) throws UserExistException;
	
	User loginUser(String userName, String password);
}
