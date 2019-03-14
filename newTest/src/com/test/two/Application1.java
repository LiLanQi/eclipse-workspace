package com.test.two;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class Application1 {
	
	static Map<Class,Object> mp = new HashMap();
	
	static {
		String srcPath = ClassLoader.getSystemResource("").getPath()+"com\\test\\two";
		//System.out.println(srcPath);
		File srcFile = new File(srcPath);
		//System.out.println(srcFile);
		File [] files = srcFile.listFiles();//当前路径下含有的文件
		
		for (File file : files) {
			String name = file.getName();
		//	System.out.println(name);
			name = "com.test.two."+name.substring(0, name.indexOf("."));
			try {
				Class clazz = Class.forName(name);
				Annotation []annotations = clazz.getAnnotations();
				for (Annotation annotation : annotations) {
					if(annotation instanceof Component) {
						try {
							Object obj = clazz.newInstance();
							mp.put(clazz, obj);
						} catch (InstantiationException | IllegalAccessException e) {
							try {
								throw new InstantiationException(clazz.getName()+"无法创建对象");
							} catch (InstantiationException e1) {
								e1.printStackTrace();
							}

						}
						
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Object getBean(Class clazz) {
		Object obj = mp.get(clazz);
		if(obj==null) {
			try {
				throw new NoSuchBeanDefinitionException("No qualifying bean of type "+clazz.getName()+" available");
			} catch (NoSuchBeanDefinitionException e) {
				e.printStackTrace();
			}
		}
		return obj;
	}
	public static void main(String[] args) {
		
	}
}
