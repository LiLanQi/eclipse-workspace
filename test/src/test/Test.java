package test;

import com.test.two.Student;

public class Test {

	public static void main(String[] args)throws NoSuchMethodException {
		try {
			Object object = Factory.newInstance(Student.class);
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
