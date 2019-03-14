package homework.userinfo.imp;

import homework.userinfo.IUserInfoDao;
import homework.userinfo.IUserInfoService;

public class UserInfoService implements IUserInfoService {

	private IUserInfoDao UserInfoDao = new UserInfoDao();
	@Override
	public boolean login(String userName, String password) {
		return UserInfoDao.login(userName, password);
	}

}
