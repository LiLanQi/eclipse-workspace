 package test.temp;

import java.lang.reflect.Modifier;

public class ThreadTest {

	public static void main(String[] args) {
//		new CountThread("线程0").start();
//		new CountThread("线程1").start();
		System.out.println(Modifier.toString(String.class.getModifiers()));
		TimeThread c = new TimeThread();
		new Thread(c,"线程1").start();
		new Thread(c,"线程2").start();
	}
}

class CountThread extends Thread{
	
	public CountThread(String str) {
		super(str);
	}

	@Override
	public void run() {
		synchronized (String.class) {
			for(int i=0;i<10;i++) {
				System.out.println(this.getName()+"@@@@@@"+i);
			}
		}
	}
}

class TimeThread implements Runnable{

	@Override
	public void run() {
		synchronized(this) {
			Thread thread = Thread.currentThread();
			for(int i=0;i<10;i++) {
				System.out.println(thread.getName()+"@@@@@@"+i);
			}
		}
	}
}
