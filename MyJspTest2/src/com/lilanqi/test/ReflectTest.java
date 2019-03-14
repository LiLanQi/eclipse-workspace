package com.lilanqi.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {

	public static void main(String[] args) {
		Method[] methods = Student.class.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			System.out.println(method);
		}
		
		Field[] fields = Student.class.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
			System.out.println(field);
		}
		
		Constructor[] constructors = Student.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
			System.out.println(constructor.getName());
		}
	}
}
