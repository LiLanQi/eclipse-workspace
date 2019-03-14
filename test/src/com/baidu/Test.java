package com.baidu;

import test.Bat;

public class Test {

	public static void main(String[] args) {
		String str = "ABCBCB";
		System.out.println(str.lastIndexOf("CB", 3));
		System.out.println(str.lastIndexOf("CB", 4));
	}
}