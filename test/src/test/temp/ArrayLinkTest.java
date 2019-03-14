package test.temp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLinkTest {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		names.add(1, "王五");
		for (String name : names) {
			System.out.println(name);
		}
//		names.clear();
//		System.out.println(names.isEmpty());
		
		names.set(0, "张小三");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		names.remove(0);
		
	}

}
