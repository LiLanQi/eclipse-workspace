package com.test.two;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	Date date;
	public void print() {
		
		String pattern  = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String result = sdf.format(date);
		System.out.println("登录时间为："+result);
	}
}
