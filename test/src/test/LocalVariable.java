package test;

public class LocalVariable {

	{
		int x = 9;// 代码块中的局部变量
		System.out.println("x=" + x);
	}

	static void show(int arg) {// 方法参数中的局部变量
		if (arg == 1) {
			int y = 2;// 方法中的局部变量
			System.out.println("y=" + y);
		}
		// System.out.println(y);//此处不能使用y局部变量
		System.out.println("arg=" + arg);
	}

	public static void main(String[] args) {
		new LocalVariable();// 用于执行代码块中的代码
		show(1);
	}
}
