package com.test.two;


public class Test2 {


	public static void main(String[] args) {
		/*
		 * F5,F5,F7,F8
		 * F5:进入方法
		 * F6:执行下一行命令
		 * F7:退出方法
		 * F8:进行下一个断点
		 */
//		String str = "";
//		System.out.println(111);
//		str = null;
//		System.out.println(444);
//		System.out.println(str.length());
		for(;;) {
			try {
				String str = null;
				str.length();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
}
