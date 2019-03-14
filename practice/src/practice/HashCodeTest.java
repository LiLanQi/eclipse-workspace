package practice;

import java.util.Arrays;

public class HashCodeTest {

	public static void main(String[] args) {
		String s = "OK";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s + " " + s.hashCode());
		System.out.println(sb + " " + sb.hashCode());
		
		int oldList[] = {1,2,3};
		int newList[][] = {{1,2,3}, {2,3,4}, {3,4,5}};
		System.out.println(Arrays.toString(oldList));
		System.out.println(Arrays.deepToString(newList));
		
	}
}
