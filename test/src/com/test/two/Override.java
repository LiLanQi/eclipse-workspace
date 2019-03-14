package com.test.two;

public @interface Override {

	//如果为value，则可直接赋值，不是value则需要手动赋值，如果抽象方法后有default 0则不需要赋值
//	default用于为注解赋默认值，如果一个注解没有默认值，则需要手动赋值
//	如果属性名为value，则可以直接赋值
	int version() default 0;
	
}
