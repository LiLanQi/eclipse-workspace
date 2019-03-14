package com.baidu;

public class Test6 {
	
	@FunctionalInterface
	interface IMammal{
		void move();
	}
	
	interface IComputer{
		int add(int a,int b);
	}
	
	public static void main(String[] args) {
		IMammal mammal = ()->{
				System.out.println("1111111111");
		};
		mammal.move();
		IComputer computer = (int a,int b)->a+b;
		int result = computer.add(1, 1);
		System.out.println(result);
	}
}


