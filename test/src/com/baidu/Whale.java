package com.baidu;

public class Whale implements IMammal{

	@Override//实现接口中的抽象方法时要符合重写规范
	public String move() {
		System.out.println("靠鳍游动...");
		return "";
}

	public static void main(String[] args) {
		
		System.out.println(IMammal.i);
	}
}
