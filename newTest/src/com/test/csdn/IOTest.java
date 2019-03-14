package com.test.csdn;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class IOTest {

	public static void main(String[] args) {
//		File file0 = new File("E:");
//		File file1 = new File("E:\\Program_Files");
//		File file2 = new File("E:\\Program_Files\\apache-tomcat-8.0.32");
//		File file3 = new File("E:\\Program_Files\\apache-tomcat-8.0.32\\bin") ;
//		System.out.println(file0.getParentFile().getName());
//		System.out.println(file1.getParentFile().getName());
//		System.out.println(file2.getParentFile().getName());
//		System.out.println(file3.getParentFile().getName());
		
		
//		File[] file0 = new File("E:").listFiles();
//		File[] file1 = new File("E:\\Program_Files").listFiles();
//		String[] file2 = new File("E:\\Program_Files\\apache-tomcat-8.0.32").list();
//		File[] file3 = new File("E:\\Program_Files\\apache-tomcat-8.0.32\\bin").listFiles() ;
//		
//		for (File file : file0) {
//			System.out.println(file.getAbsolutePath());
//		}
		
//		Class clazz = String[].class;
//		System.out.println(clazz);
//		//FileInputStream fis = null;
//	//	FileOutputStream fos = null;
//		try {
//			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\LiLanQi\\Desktop\\刘莱斯 - 浮生.mp3"));
//			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\刘莱斯 - 浮生.mp3"));
//		//	byte[] date = new byte[1024];
//			int length;
//			while((length=bis.read())!=-1) {
//				bos.write(length);;
//			}
//			bos.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		}finally {
//			if(bos!=null) {
//				try {
//					bos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			if(bis!=null) {
//				try {
//					bis.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
//		try {
//			//Reader reader = new FileReader("E:\\存在.txt");
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\存在.txt"));
//			//Writer wirter = new FileWriter("F:\\存在.txt");
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\存在.txt"));
////			char date[] = new char[1024];
////			int len;
////			while((len=bufferedReader.read(date))!=-1) {
////				bufferedWriter.write(date,0,len);
////			}
//			String linedate;
//			while((linedate =bufferedReader.readLine())!=null) {
//				bufferedWriter.write(linedate);
//				bufferedWriter.newLine();
//			}
//			bufferedWriter.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		try {
//			FileInputStream fileInputStream = new FileInputStream("E:\\存在.txt");
//			InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("E:\\存在.txt"),"UTF-8");
//			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			//缓冲刘包裹转化流
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\存在.txt"),"UTF-8"));
			
//			FileOutputStream fileOutputStream = new FileOutputStream("F:\\存在.txt");
//			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
//			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			//缓冲刘包裹转化流
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\存在.txt"), "UTF-8"));
			
			char date[] = new char[1024];
			int len;
			while((len=bufferedReader.read(date))!=-1) {
				bufferedWriter.write(date,0,len);
			}
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
