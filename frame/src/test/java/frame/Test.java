package frame;

import com.xt.userinfo.IUserInfoService;
import com.xt.userinfo.imp.UserInfoService;

public class Test {

	public static void main(String[] args) {
		IUserInfoService userInfoService = new UserInfoService();
		String username = "222";
		String password = "222";
		if(userInfoService.login(username, password)) {
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
	}
}
