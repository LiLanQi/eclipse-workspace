package com.zzxtit.spring.ioc.first;

public class Main {

	
	public static void main(String[] args) {
		
//		Apple apple = new Apple();
		Apple apple = new Apple("红富士");
		
		Apple aple = (Apple) FruitFactory.getFruit("apple");
		
		apple.desc();
		aple.desc();
	}
}
