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
		this(age,id);//���ù��췽��
		this.age = age;
		this.id = id;
	}
	
	public void say() {
		System.out.println("i say");
		//Child(age,id,number,address);��������ͨ�����е��ù��췽��
		play();//�Ǿ�̬������������һ���Ǿ�̬����Ĭ��ǰ�溬��һ��this
	}
	
	public void play() {
		System.out.println("i play");
		System.out.println(this);//˭������������������˭
	}

	public static void main(String[] args) {

		Child child = new Child(7,"121615");
	}
}