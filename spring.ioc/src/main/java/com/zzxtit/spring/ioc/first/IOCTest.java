package com.zzxtit.spring.ioc.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

	public static void main(String[] args) {
		
		//初始化IOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		Apple apple = ioc.getBean("apple", Apple.class);
		apple.desc();
		
		
		
	}
	
}
