package com.ghj.test;

import java.io.IOException;
import java.util.Scanner;

import com.ghj.tool.SMSUtils;

/**
 * 测试通知类短信（运营类短信只提供企业使用）
 *
 * @author GaoHuanjie
 */
public class NoticeMsgTest {

	private static String mobile = "18236917829";
	
	/**
	 * 内容1：您的验证码为%s,10分钟内有效。
	 * 内容2：%s，您好，您在洋洋书店网站注册的%s账号所对应密码修改成功，如果不是本人操作，请及时网站进行修改。
	 * 
	 * 如何校验：在本工程生成的验证码在短信中一起发出，可以将生成的验证码保存在session中，待客户输入收到的验证码后，再从session中获取，进而实现校验
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~内容1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String sMSCode = SMSUtils.getRandomSMSCode(5, true);
		if(SMSUtils.isMobile(mobile)){
			try {
				SMSUtils.sendSmg("[\""+mobile+"\"]", "[\""+sMSCode+"\"]", "9424065");//发送验证码
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("请输入您收到的短信验证码：");
		String code = new Scanner(System.in).next();
		if(sMSCode.equals(code)){//校验验证码
			System.out.println("验证码正确...");
		}else{
			System.out.println("验证码错误...");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~内容2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if (SMSUtils.isMobile(mobile)) {
			try {
				SMSUtils.sendSmg("[\"" + mobile + "\"]", "[\"" + "高焕杰" + "\",\"" + "fuliuqingfeng" + "\"]", "3031227");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}