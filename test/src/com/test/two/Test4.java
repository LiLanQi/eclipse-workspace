package com.test.two;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Test4 implements Serializable{
	
	/**
	 * 这是一个打印方法
	 * @param str
	 */
	@Autowired
	public void print(String str) {
		System.out.println("sdasdasd");
	}
	

	
	@SuppressWarnings("unused")
	private String str;
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public static void main(String[] args) {
//		
//		@SuppressWarnings("unused")
//		String name = "1231";
//	}
//	
//	@Override()
//	public boolean equals(Object obj){
//		return false;
//	}
//	
//	@Deprecated
//	void move(Bike bike) {
//		
//	}
//	
//	void move(Car car) {
//		
//	}

}

//class Bike{
//	
//}
//
//class Car{
//	
//}
