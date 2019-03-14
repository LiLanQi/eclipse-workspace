package com.baidu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5 {
	public static void main(String[] args) {
		
		Date date = new Date();//系统时间
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMdd");
		String currentDate = simpleDateFormat.format(date);
			System.out.println(currentDate);
	}
}
