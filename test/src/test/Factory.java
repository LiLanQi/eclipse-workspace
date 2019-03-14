package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Factory {

	public static Object newInstance(Class clazz) throws NoSuchMethodException {
		Object object = null;
		try {
			Constructor constructor = clazz.getConstructor();
			object = constructor.newInstance();
		} catch (NoSuchMethodException | SecurityException e) {
			throw new NoSuchMethodException(clazz.getName()+"缺少无参构造方法");
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

	public static void main(String[] args) {
		System.out.println(className);
	}

}
