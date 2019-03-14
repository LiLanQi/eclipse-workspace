package com.test.two;

import java.lang.reflect.Array;

public class Array1 {

	public static void main(String[] args) {
		
		Object array = Array.newInstance(Double.TYPE,9);
		Array.set(array, 0, 99.5);
		double Double = Array.getDouble(array, 0);
	//	System.out.println(Double);
		int length = Array.getLength(array);
		for(int i=0;i<length;i++) {
			Double = Array.getDouble(array, i);
			System.out.println(Double);
		}
	}
}
