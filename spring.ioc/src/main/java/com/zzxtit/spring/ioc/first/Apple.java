package com.zzxtit.spring.ioc.first;

public class Apple extends Fruit{

	private String size;
	
	private String color;
	
	public Apple() {
		System.out.println("Apple类开始被实例化！！！");
	}
	
	public Apple(String type) {
		System.out.println("通过Apple类有参构造方法开始被实例化！！！");
	}
	
	public void init() {
		System.out.println("Apple类开始被IOC容器初始化。。。。。。。。。。。。。。。");
	}
	
	public void destory() {
		System.out.println("Apple类开始被IOC容器销毁。。。。。。。。。。。。。。。");
	}
	
	public void desc() {
		System.out.println("看起来很好吃的样子！");
	}
	
	
}
