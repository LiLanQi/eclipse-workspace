package com.test.two;


import java.lang.reflect.Field;
import java.lang.reflect.Type;

class Student1 {

	public String name;//姓名
}

public class GenericType {

	public static void main(String[] args) throws Exception {
		Class<Student1> clazz = Student1.class;
		Field field = clazz.getField("name");
		Type type = field.getGenericType();
		System.out.println(type);
	}
}