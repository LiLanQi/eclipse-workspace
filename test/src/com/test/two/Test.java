package com.test.two;

import java.lang.reflect.Constructor;

public class Test {
	
	public static void main(String[] args) throws Exception {
//////		Color colors[] = Color.values();
//////		for (Color color : colors) {
//////			System.out.println(color.getId()+":"+color.getName());
//////		}
////		Color.test(Color.GREEN);
////		try {
////			Class clazz = Class.forName("com.test.two.Student");
////			clazz = Student.class;
////			clazz = Integer.class;
////			clazz = Byte.TYPE.getSuperclass();
////			System.out.println(clazz);
////			clazz = Short.TYPE;
////			clazz = Long.TYPE;
////			clazz = Boolean.TYPE;
////			clazz = Double.TYPE;
////			clazz = Float.TYPE;
////			clazz = Character.TYPE;
////			
////			String[] str = new String[5];
////			clazz = String[].class;
////			
////			clazz = new Student().getClass();
////	
////		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
////		}
//		
	//	try {
			Class clazz = Class.forName("com.test.two.Student");
			Constructor [] constructors = clazz.getDeclaredConstructors();
			for(Constructor constructor:constructors) {
				System.out.println(constructor);}
//
////			Constructor constructor = clazz.getConstructor();
////			System.out.println(constructor);
//			Constructor constructor1 = clazz.getDeclaredConstructor(String.class);
////			System.out.println(constructor1);
////			constructor1.setAccessible(true);
////			Object obj = constructor1.newInstance("xiaowang");
////			System.out.println(obj);
//			Class c = constructor1.getDeclaringClass();
//			System.out.println(c);
//			int a = constructor1.getModifiers();
//			String str = Modifier.toString(a);
//			System.out.println(str);
//			System.out.println(constructor1.getName());
//			Class [] types = constructor1.getParameterTypes();
//			for (Class class1 : types) {
//				System.out.println(class1);
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
////		} catch (NoSuchMethodException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (SecurityException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (InstantiationException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (IllegalAccessException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (IllegalArgumentException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (InvocationTargetException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		Class clazz = Student.class;
//		Method []  methods = clazz.getMethods();//public 并且包含继承中的方法
//		methods = clazz.getDeclaredMethods();//本类所有方法
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}
		
		
//		
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
		
		
		
//		Class  clazz = Student.class;
//		try {
//			Method method = clazz.getDeclaredMethod("print",String.class);
//			System.out.println(method.getDeclaringClass());
//			int a = method.getModifiers();
//			String str = Modifier.toString(a);
//			System.out.println(str);
//			System.out.println(method.getReturnType());
//			System.out.println(method.getName());
//			System.out.println(method.getParameterTypes());
//			System.out.println(method.getExceptionTypes());
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		}
//		
//		Class clazz = Student.class;
//		try {
//			Field field = clazz.getField("name");
//			String str = field.getName();
//			System.out.println(str);
//			
//			Student student = new Student();
//			field.set(student, "xiaowang");
//			Object obj = field.get(student);
//			System.out.println(obj);
//		} catch (NoSuchFieldException | SecurityException e) {
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		Class clazz = Student.class;
//		try {
//			Constructor constructor = clazz.getConstructor(String.class);
//			Object obj = constructor.newInstance("小林");
//			Field field = clazz.getField("age");
//			
//			field.set(, "21");
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		
		
//		LoginService loginService = new LoginService();
//		Reflect.inject(loginService);
//		loginService.login();

//		Date1 date1 = new Date1();
//		date1.print();
		
		
		
		
			