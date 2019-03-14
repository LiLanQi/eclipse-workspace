package com.test;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class Bat {

	static Map<Class, Object>map = new HashMap<Class, Object>();
		
		
	static {
		String srcPath = ClassLoader.getSystemResource("").getPath()+"com\\test\\two";
		//System.out.println(srcPath);
		File srcFile = new File(srcPath);
		File [] files = srcFile.listFiles();//当前路径下含有的文件
		
		for (File file : files) {
			//2、依据文件名拼接类名——"包名"+类名
			String className = file.getName();
			//System.out.println(className);
			className ="com.test.two."+className.substring(0, className.indexOf("."));
			//System.out.println(className);
			try {
				Class clazz = Class.forName(className);
				Annotation[] anotations = clazz.getAnnotations();
				for (Annotation annotation : anotations) {
					if(annotation instanceof Component) {
						try {
							clazz.newInstance();
							map.put(clazz,clazz.newInstance());
						} catch (InstantiationException e) {
							try {
								throw new InstantiationException(clazz.getName()+"没有无参构造方法");
							} catch (InstantiationException e1) {
								e1.printStackTrace();
							}
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Object getBean(Class clazz) throws NoSuchBeanDefinitionException {
		Object obj =  map.get(clazz);
		if(obj==null) {
			throw new NoSuchBeanDefinitionException("No qualifying bean of type "+clazz.getName()+" available");
		}
		return obj;
	}
	
	public static void main(String[] args) throws NoSuchBeanDefinitionException {
		Object object = getBean(Elephant.class);
		System.out.println(object);
	}
}