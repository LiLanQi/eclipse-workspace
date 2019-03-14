package com.zzxtit.spring.ioc.first;

public class Banana extends Fruit{
	
	private String size;
	
	private String color;
	
	public void desc() {
		System.out.println("看起来很好吃的样子！");
	}
	
	public void init() {
		System.out.println("Banana类开始被IOC容器初始化。。。。。。。。。。。。。。。");
	}
	
	public void destory() {
		System.out.println("Banana类开始被IOC容器销毁。。。。。。。。。。。。。。。");
	}
}
