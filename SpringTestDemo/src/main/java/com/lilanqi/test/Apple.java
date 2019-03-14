package com.lilanqi.test;

public class Apple extends Fruit{
	
	private String type;
	
	private String color;
	
	private String location;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Apple() {
		System.out.println("Apple类开始实例化");
	}
	
	public Apple (String type, String color) {
		this.type = type;
		this.color = color;
	}
 	
	public void init() {
		System.out.println("Apple类开始初始化");
	}
	
	public void desc() {
		System.out.println(type + "苹果的颜色是" + color + ",产地" + location);
		System.out.println("Apple进行销毁");
	}

}
