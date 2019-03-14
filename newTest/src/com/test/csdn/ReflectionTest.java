package com.test.csdn;

import java.io.File;
import java.io.IOException;

public class ReflectionTest {

	public static void main(String[] args) {
//		File file = new File("E:\\课件");
		String path = "E:\\课件";
		print(path);
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.exists());
//		System.out.println(file.getParentFile().getPath());
//		System.out.println(file.getParent());
//		
//		file = new File("E:\\Program_Files\\apache-tomcat-8.0.32\\lib\\annotations-api.jar");
//		System.err.println(file.isFile());
//		System.err.println(file.isDirectory());
//		System.err.println(file.exists());
//		System.err.println(new File(file.getParent()).getPath());
//		
//		file = new File("E:");
////		if(file.mkdirs()) {
////			System.out.println("yes");
////		}
//		if(file.delete()) {
//			System.out.println("YES");
//		}
////		try {
////			if(file.createNewFile()) {
////				System.err.println("YES");
////			}
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
//		
////		String []Files = file.list();
////		for (String file1 : Files) {
////			System.out.println(file1);
////		}
////		File []paths = file.listFiles();
////		for (File file2 : paths) {
////			System.err.println(file2.getPath());
////		}
//		
//		file = new File("E:"+File.separator+"Test.java");
//		File newFile = new File("E:"+File.separator+"Main.java");
//		if(file.renameTo(newFile)) {
//			System.out.println("YES");
//		}
	}
	
	public static void print(String str) {
		File file = new File("E:"+File.separator+"课件");
		if(file.isDirectory()) {
			String []files = file.list();
			for (String file2 : files) {
				if(file2!=null) {
					print(file2);
				}
			}
		}
		else {
			System.out.println(file.getPath());
		}
	}
}