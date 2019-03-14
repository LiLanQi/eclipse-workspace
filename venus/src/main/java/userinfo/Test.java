package userinfo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("C:\\Windows\\System32\\cmd.exe");
		File file1 = file.getParentFile();//返回文件名cmd.exe
		System.out.println(file1);
		System.out.println(file);
	}
}
