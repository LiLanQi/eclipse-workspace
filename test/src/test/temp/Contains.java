package test.temp;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
//		ArrayList<String> names = new ArrayList<>();
//		names.add("张三");
//		System.out.println(names.remove(new String("张三")));
//		//names.contains("张三");
//		String name = "张三";
//		System.out.println("张三"==new String("张三"));
//		System.out.println("张三"==name);
//		System.out.println(name.equals("张三"));
		
//		ArrayList<Integer> names = new ArrayList<>();
//		names.add(1);
//		System.out.println(names.remove(new Integer(1)));
		
//		ArrayList<Student> students = new ArrayList<>();
//		students.add(new Student("12345"));
//		System.out.println(students.contains(new Student("12345")));
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("12345"));
		System.out.println(students.remove((new Student("12345"))));
		
	}
}
