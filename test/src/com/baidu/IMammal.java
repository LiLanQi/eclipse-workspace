package com.baidu;

//接口可以继承多个接口
public interface IMammal {
	
//	只能定义常量，抽象类，内部类，其他的都无法定义
//	{
//		
//	}
//	
//	static {
//		
//	}
//	
//	public IMammal{
//		
//	}
	
	//默认前面加了static final，可证明
	int i=9;
	//默认前面加了public abstract，可证明
	Object move();

	class Body{
	 
	}
}

//前面不用加public，因为加了之后类名要和public修饰的一致，所以会报错
//interface IA{
//	
//}
//
//interface IB{
//	
//}
//
//abstract class C{
//	
//}