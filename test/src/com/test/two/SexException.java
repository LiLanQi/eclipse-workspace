package com.test.two;

//SexException继承Exception，与RuntimeException没有任何关系
public class SexException extends Exception{
	
	public SexException() {
		
	}
	
	public SexException(String message) {
		super(message);
	}
		
}
