package com.baidu;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要注册的账号：");
		while(scanner.next().length()<=6) {
			System.out.println("用户名不得小于六位，请重新输入");
			scanner.next();
		}
		System.out.println("请输入密码：");
		String code1 = scanner.next();
		System.out.println("请再次输入密码：");
		String code2 = scanner.next();
		if(code1.equals(code2) && code1.length()>8) {
			System.out.println("注册成功");
		}else {
			System.out.println("俩次输入密码不一致或密码长度不足8位，注册失败");
		}
	}

}
