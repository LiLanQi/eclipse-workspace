package test;

class Father {

	public void eat() {
		System.out.println("筷子吃饭....");
	}
}

/**
 * 外部类
 */
public class Test1 {

	/**
	 * 匿名内部类
	 */
	static Father son = new Father(){
		
		@Override
		public void eat() {
			System.out.println("11吃饭....");
		}
	};
	public static void main(String[] args) {
		
		{
			son.eat();
		}
	}
}


