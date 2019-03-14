package com.test.two;

public class TestException {

	public static void main(String[] args) {
		try {
			String[] nameArray = { "小王", "小李", "小高" };
			for (int i = 0; i < 4; i++) {
				System.out.println(nameArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数据下标越界，请修改程序！");
			System.out.println("调用异常对象的getMessage()方法：");
			System.out.println(e.getMessage());
			System.out.println("调用异常对象的printStackTrace()方法：");
			e.printStackTrace();
			return;// finally语句块仍然执行
			// System.exit(1);//直接退出JVM，finally语句块不再执行
		} finally {
			System.out.println("显示完毕！1");
		}
		System.out.println("显示完毕！");
	}
}
