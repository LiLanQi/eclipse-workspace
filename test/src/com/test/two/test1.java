package com.test.two;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class test1 {

	public static void main(String[] args){
		
		try {
			System.out.println(1/0);
			String name =null;
			System.out.println(name);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
//			
		}
		
		
//		try {
//			System.out.println(1/0);
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		System.out.println("AAAAAAAAAAAAAAAA");
		
		
			Sex student = new Sex();
			try {
				student.setSex("男");
			} catch (Exception e) {
				System.out.println(22222);
			}
				System.out.println(33333);
			
		
		
	}
}
