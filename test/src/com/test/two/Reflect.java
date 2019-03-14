package com.test.two;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflect {
	public static void inject(Object object) {
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			Annotation[] annotations = field.getAnnotations();// 获取域中的注解，遍历注解
			for (Annotation annotation : annotations) {
				if (annotation instanceof Autowired) {// 判断注解是否为Autowired
					System.out.println(field.getGenericType().toString());
					Class<?> clazz = (Class<?>) field.getGenericType();// 获取该域的类型
					System.out.println(clazz);
					try {
						field.set(object, clazz.newInstance());// 利用反射实现赋值
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
