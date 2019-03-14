package com.baidu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Test3 {

	public static void main(String[] args) {
		
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String current = dfs.format(new Date());
		System.out.println(current);
	}
}
