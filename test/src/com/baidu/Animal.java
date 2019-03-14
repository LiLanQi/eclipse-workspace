package com.baidu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal{
	
	public static void main(String[] args) {
		Object object = new Date();
		print(new Date());
	}
	
	public static void print(Object object) {
		if(object instanceof Date) {
			Date date = (Date) object;
			String format = "yyyy-MM-dd HH:mm:ss";
			String result = new SimpleDateFormat(format).format(date);
			System.out.println(result);
		}
		
	}
}
