import java.io.IOException;
import java.util.Scanner;

import com.xt.util.SMSUtils;

/**
 * 手机验证码测试类
 * 
 * @author 李岚祺
 *
 */
public class TestPhoneCode {
	
	private static String mobile = "18236917829";

	public static void main(String[] args) {
		try {
			SMSUtils.sendCode(mobile, "4003516");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你收到的验证码");
		String code = scanner.nextLine();
		try {
			if(SMSUtils.verifyCode(mobile, code)) {
				System.out.println("校验成功");
			}else {
				System.out.println("校验失败");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
