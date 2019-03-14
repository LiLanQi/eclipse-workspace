package com.lilanqi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/application.xml");
		/*Apple ap = ac.getBean("apple", Apple.class);
		ap.desc();*/
		
		/*Teacher teacher = ac.getBean("teacher", Teacher.class);
		System.out.println(teacher.toString());*/
		
		Student stu = ac.getBean("student", Student.class);
		System.out.println(stu.toString());
	}
}
