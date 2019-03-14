package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(3);
		list.add("li");
		list.add("lan");
		list.add("qi");
		list.forEach(str->System.out.println(str));
		Iterator it = list.iterator();
		it.forEachRemaining(str->System.out.println(str));
	}
}