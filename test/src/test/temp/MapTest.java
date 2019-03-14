package test.temp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String,Double> mp = new HashMap<>();
		mp.put("张三",(double)100);
		mp.put("李四",(double)90);
//		System.out.println(mp.size());
//		System.out.println(mp.get("张三"));
//		mp.clear();
//		System.out.println(mp.size());
//		System.out.println(mp.isEmpty());
//		System.out.println(mp.containsKey("张三"));
//		Collection<Double> collection=  mp.values();
//		for (Double double1 : collection) {
//			System.out.println(double1);
//		}
//		System.out.println(mp.containsValue(100.0));
		
		Set<String> set = mp.keySet();
//		for (String string : set) {
//			System.out.println(string+" "+mp.get(string));
//		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" "+mp.get(it.next()));
		}
//		
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		Set<Entry<String,Double> > set1 = mp.entrySet();
//		for (Entry<String, Double> entry : set1) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		
	}
}