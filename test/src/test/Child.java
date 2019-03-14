package test;

public class Child {

	private int age;
	private String id;
	private String number;
	private String address;
	
	public Child(int age, String id) {
		this.age = age;
		this.id = id;
		System.out.println(this);
		say();
	}
	
	public Child(int age, String id, String number, String address) {
		this(age,id);//调用构造方法
		this.age = age;
		this.id = id;
	}
	
	public void say() {
		System.out.println("i say");
		//Child(age,id,number,address);不能在普通方法中调用构造方法
		play();//非静态方法调用另外一个非静态方法默认前面含有一个this
	}
	
	public void play() {
		System.out.println("i play");
		System.out.println(this);//谁调用了这个方法则输出谁
	}

	public static void main(String[] args) {

		Child child = new Child(7,"121615");
	}
}