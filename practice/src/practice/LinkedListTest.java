package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("li");
		a.add("lan");
		a.add("qi");
		
		List<String> b = new ArrayList<>();
		b.add("feng");
		b.add("yu");
		b.add("ming");
		System.out.println(a);
		System.out.println(b);
		ListIterator aIt = a.listIterator();
		Iterator bIt = b.iterator();
		
		while(bIt.hasNext()) {
			if(aIt.hasNext())	aIt.next();
			aIt.add(bIt.next());
		}
		System.out.println(a);
		System.out.println(b);
		
		bIt = b.iterator();
		while(bIt.hasNext()) {
			bIt.next();
			if(bIt.hasNext()) {
				bIt.next();
				bIt.remove();
			}
		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		/*aIt = a.listIterator();
		aIt.next();
		aIt.remove();
		aIt.remove();*/
	}
}
