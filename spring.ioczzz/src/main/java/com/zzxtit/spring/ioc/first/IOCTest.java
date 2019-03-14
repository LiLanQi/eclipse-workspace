package com.zzxtit.spring.ioc.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

	public static void main(String[] args) {
		
		//初始化IOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		System.out.println("---------------IOC容器初始化完毕！！");
		
//		Apple apple = ioc.getBean("apple", Apple.class);
//		apple.desc();
		
		
//		Apple apple1 = ioc.getBean("apple", Apple.class);
//		apple1.desc();
//		
//		Apple apple2 = ioc.getBean("apple", Apple.class);
//		apple2.desc();
		
//		Banana ba = ioc.getBean("com.zzxtit.spring.ioc.first.Banana", Banana.class);
//		ba.desc();
//		Banana ba1 = ioc.getBean("com.zzxtit.spring.ioc.first.Banana", Banana.class);
//		ba1.desc();
//		Banana ba2 = ioc.getBean("com.zzxtit.spring.ioc.first.Banana", Banana.class);
//		ba2.desc();
		
		
//		Goods goods = ioc.getBean("goods", Goods.class);
//		
//		System.out.println("===============>" + goods.getDesc());
		
		Student stu = ioc.getBean("student", Student.class);
		System.out.println("================>" + stu);
		
	}
	
}
