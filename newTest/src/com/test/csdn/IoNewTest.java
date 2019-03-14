package com.test.csdn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IoNewTest {

	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\LiLanQi\\Desktop\\刘莱斯 - 浮生.mp3"))) );
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\刘莱斯 - 浮生.mp3")));
			char date[] = new char[128];
			int len;
			while((len=bufferedReader.read(date))!=-1) {
				bufferedWriter.write(date,0,len);
			}
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
		}
//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\存在.txt"));
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\存在.txt"));
//			int len;
//			
//			while((len = bufferedReader.read())!=-1) {
//				bufferedWriter.write(len);
//			}
//			bufferedWriter.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
