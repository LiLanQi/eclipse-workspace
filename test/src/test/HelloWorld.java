package test;

public class HelloWorld {
	
	int age;
	
	{
		System.out.println(age);
		int age=21;
		System.out.println(this.age);
	}
//	int age;
//	static boolean name;
//	static double number;
	
//	static {
//		System.out.println("��̬�����");
//	}
//	{
//		System.out.println("�Ǿ�̬�����");
//	}
	
	public static void main(String[] args) {
		
		new HelloWorld();
//		new HelloWorld();
//		System.out.println(new HelloWorld().age);
//		System.out.println(number);
//		System.out.println(name);
		
	}
}
