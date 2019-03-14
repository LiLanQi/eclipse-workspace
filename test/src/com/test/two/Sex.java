package com.test.two;

import java.awt.PointerInfo;

public class Sex {

	private String sex;
	
	{
		String sex="中";
		if(!(sex.equals("男") || sex.equals("女"))) 
			throw new RuntimeException("性别不存在");
	}
	
	public String getSex() {
		return sex;
	}
	
/*1.throw与throws的区别
 * a.使用位置：throws用于方法括号后面，throw用于方法体或代码块
 * b.抛出内容：throws后面写异常类，可以使多个，throw后面只能抛出一个异常对象
 * 		运行时异常：如果一个类继承RuntimeException或者其子类，那么该类为运行时异常，否则为检查时异常
 * c.如果throw抛出的对象为运行时异常创建的对象，则不用使用throws，否则使用throws抛出其异常类或父类
 * 
 * 2.如何throws抛出的异常对象
 * a.将异常抛出后自己捕获
 * b.将异常抛给方法调用者--①方法调用者捕获 ②throws接着往上抛给JVM
 */
	public void setSex(String sex)throws SexException{
		if(!(sex.equals("男") || sex.equals("女"))) {
			throw new SexException("性别不存在");
		}else {
			this.sex = sex;
		}
	}
}