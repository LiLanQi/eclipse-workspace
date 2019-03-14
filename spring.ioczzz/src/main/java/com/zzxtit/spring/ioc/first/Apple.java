package com.zzxtit.spring.ioc.first;

public class Apple extends Fruit{

	private String size;
	
	private String color;
	
	private String type;
	
	public Apple() {
		System.out.println("Apple类开始被实例化！！！");
	}
	
	public Apple(String type, String color) {
		this.type = type;
		this.color = color;
		System.out.println("通过Apple类有参构造方法开始被实例化！！！");
	}
	
	public void init() {
		System.out.println("Apple类开始被IOC容器初始化。。。。。。。。。。。。。。。");
	}
	
	public void destory() {
		System.out.println("Apple类开始被IOC容器销毁。。。。。。。。。。。。。。。");
	}
	
	public void desc() {
		System.out.println("这个" + type + "的苹果是：" + color + "看起来很好吃的样子！");
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
