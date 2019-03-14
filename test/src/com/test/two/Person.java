package com.test.two;

import com.ghj.exception.AgeException;

public class Person {

	private int age;// 年龄

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeException {
		if (age < 0 || age > 150) {
			throw new AgeException("年龄必须在0~150之间：" + age + "不合理!");
		} else {
			this.age = age;
		}
	}
}
