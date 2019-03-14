package com.lilanqi.test;

public class Banana extends Fruit{

	public Banana() {
		System.out.println("Banana类开始实例化");
	}
	
	public void init() {
		System.out.println("Banana类开始初始化");
	}
	
	public void desc() {
		System.out.println("Banana进行销毁");
	}
}
