package practice;

import java.util.Arrays;

import javax.swing.Timer;

import org.omg.Messaging.SyncScopeHelper;

public class LambdaTest{
	static String[] s = {"aaa", "bbbb", "aaaaa"};
	
	public static void main(String[] args) {
		Arrays.sort(s, (s1, s2)->s1.length() - s2.length());
//		Arrays.sort(s, String::compareToIgnoreCase);
		for (String string : s) {
			System.out.println(string);
		}
		Timer t = new Timer(1000,System.out::println);
		t.start();
		repeat(1, i->System.out.println("Countdown:" + (9-i)));
	}
	
	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++) {
			action.accept(i);
		}
	}
}



