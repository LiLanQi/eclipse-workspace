package com.test.two;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;



public class Test3 {
	public static void main(String[] args) throws Exception  {
		Class clazz = Student.class;
//		clazz = Class.forName("com.test.two.Student");
//		clazz = Integer.TYPE;
//		clazz = new Student().getClass();
//		clazz = String[].class;
//		clazz = clazz.getSuperclass();
		
		Constructor constructor = clazz.getConstructor();
//		Constructor []constructors = clazz.getConstructors();
//		constructor = clazz.getDeclaredConstructor();
//		constructors = clazz.getDeclaredConstructors();
		Constructor constructor1 = clazz.getDeclaredConstructor(String.class);
		System.out.println("ssssssssssssss"+constructor1+"sssssssssssss");
		constructor1.setAccessible(true);
		Object obj = constructor1.newInstance("xiaowang");
		System.out.println(obj);
		String str = constructor1.getName();
		System.out.println(str);
		Class c = constructor1.getDeclaringClass();
		System.out.println(c);
		System.out.println(clazz);
		int a = constructor1.getModifiers();
		String str1 = Modifier.toString(a);
		System.out.println(str1);
		System.out.println("aaaaaaaaaaaa"+constructor1.getName());
		Class [] types = constructor1.getParameterTypes();
		for (Class class1 : types) {
			System.out.println(class1);
		}
//		Class clazz = Student.class;
//		Method []  methods = clazz.getMethods();//public 并且包含继承中的方法
//		methods = clazz.getDeclaredMethods();//本类所有方法
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}
//		try {
//			Class clazz = Student.class;
//			Method method = clazz.getDeclaredMethod("print",String.class);
//		//	System.out.println(method.getName());
//			
//			method.setAccessible(true);
//			method.invoke(clazz.getConstructor().newInstance(),"xiaowang");
//			
//		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
//			e.printStackTrace();
//		}
		
//		Class clazz = Student.class;
//		Field field = clazz.getField("name");
//		System.out.println(field.getName());
		
//		Class clazz = Student.class;
//		Constructor constructor = clazz.getConstructor(String.class);
//		Object obj = constructor.newInstance("LiLin");
//		Field field = clazz.getDeclaredField("age");
//		field.setAccessible(true);
//		field.set(obj, 21);
//		Method method = clazz.getDeclaredMethod("printfInfo", String.class);
//		method.setAccessible(true);
//		Object object = method.invoke(obj, "河南");
//		System.out.println(object);
		
		
	}
}

