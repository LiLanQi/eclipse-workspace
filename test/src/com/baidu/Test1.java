package com.baidu;

public class Test1 {

	String name;
	
	void doHomework(){
		System.out.println(this.name+"正在做作业.......");
		name="刘颖";
	}
	
	void speak(){
		System.out.println(name+"正在说话......");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.doHomework();
		student.speak();
	}
}