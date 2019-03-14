package com.test.csdn;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Factory {

	public static Object newInstance(Class clazz) throws NoSuchMethodException {
		Object object = null;
		try {
			Constructor constructor= clazz.getConstructor();
			object = constructor.newInstance();//创建对象
		} catch (NoSuchMethodException | SecurityException e) {
			throw new NoSuchMethodException(clazz.getName()+"类缺少无参构造方法");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return object;
	}
}
