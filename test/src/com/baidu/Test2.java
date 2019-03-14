package com.baidu;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		String []name = "xt_0712 xt_0704 xt_0715 xt_0504 xt_0602 xt_0711 xt_0607".split(" ");
		for(int i=0;i<name.length;i++) {
			if(name[i].startsWith("xt_07")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
