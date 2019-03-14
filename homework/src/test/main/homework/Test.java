package homework;

import homework.userinfo.IUserInfoService;
import homework.userinfo.imp.UserInfoService;

public class Test {

	private static IUserInfoService UserInfoService = new UserInfoService();
	
	public static void main(String[] args) {
		String userName="111";
		String password="111";
		if(UserInfoService.login(userName, password)) {
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
	}

}
