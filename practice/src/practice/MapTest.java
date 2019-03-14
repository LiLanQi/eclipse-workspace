package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> staff = new HashMap<>();
		staff.put(1, "li");
		staff.put(2, "lan");
		staff.put(3, "qi");
		System.out.println(staff);
		staff.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println(staff.getOrDefault(4, "0"));
		System.out.println(staff.put(1, "feng"));
		for (Map.Entry<Integer, String> entry : staff.entrySet()) {
			int ket = entry.getKey();
			String value = entry.getValue();
		};
	}
}