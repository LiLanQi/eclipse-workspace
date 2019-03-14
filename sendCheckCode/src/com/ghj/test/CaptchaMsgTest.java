package com.ghj.test;

import java.io.IOException;
import java.util.Scanner;

import com.ghj.tool.SMSUtils;

/**
 * 测试验证码类短信
 *
 * @author GaoHuanjie
 */
public class CaptchaMsgTest {
	
	private static String mobile = "18236917829";
	
	/**
	 * 短信内容：您的验证码为%s,10分钟内有效。
	 * 
	 * @author GaoHuanjie
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		if(SMSUtils.isMobile(mobile)){
			try {
				SMSUtils.sendCode(mobile,"9424065");//发送验证码
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("请输入您收到的短信验证码：");
		String code = new Scanner(System.in).next();
		try {
			if(SMSUtils.verifyCode(mobile, code)){//校验验证码
				System.out.println("验证码正确...");
			}else{
				System.out.println("验证码错误...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}