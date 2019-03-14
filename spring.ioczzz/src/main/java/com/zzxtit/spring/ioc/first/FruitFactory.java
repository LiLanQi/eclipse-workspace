package com.zzxtit.spring.ioc.first;

public class FruitFactory {

	
	public static Fruit getFruit(String name) {
		switch(name) {
		case "apple":
			return new Apple("红富士");
		case "banana":
			return new Banana();
		default:
			return new Fruit();
		}
	}
	
}
