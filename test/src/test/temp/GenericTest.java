package test.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
//		List list = new ArrayList<>();
//		list.add("111");
//		//System.out.println(list.get(0));
//		print(list);
//		Character a = 127;
//		Integer b = -129;
//		Character c = 127;
//		char d = 127;
//		System.out.println(a==d);
		
//		List<Integer> list = new ArrayList<Integer>();
//		List<String> list1 = new ArrayList<>();
//		list.add(111);
//		list.add(222);
//		list.add(105);
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.min(list));
//		list1.add("lilanqi");
//		list1.add("fengyuming");
//		System.out.println(Collections.max(list1));
//		System.out.println(Collections.min(list1));
//		Collections.sort(list,new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//			}
//			
//		});
//		for (Integer in : list) {
//			System.out.println(in);
//		}
		
		Integer a [] = {11,22,33,12,14};
		Arrays.sort(a,(Integer o1, Integer o2)->o2-o1);
		
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}
	
	
	
	
	public static void print(List<? super Object> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
