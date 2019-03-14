package com.baidu;

import java.time.LocalDate;

public class ThreadTest {

	/*public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		Bike bike = tt.new Bike();
		TimeThread timeThread1 = tt.new TimeThread(bike,"1李岚祺");
		timeThread1.start();
		TimeThread timeThread2 = tt.new TimeThread(bike,"2冯育铭");
		timeThread2.start();
	}
	
	class TimeThread extends Thread{
		Bike bike;
		String name;
		
		public TimeThread(Bike bike,String name) {
			this.bike = bike;
			this.name = name;
		}
		
		@Override
		public void run() {
			System.out.println("@@@@@@@@"+name);
			bike.move(name);
		}

	}
	
	class Bike{
		public void move(String name) {
			synchronized (Bike.class) {
				for (int i = 0; i < 100; i++) {
					System.out.println(name + "骑自行车:" + i);
				}
			}
		}
	}*/
	
	
	
	public static void main(String...args) {
		
		Runnable printThread=()->{
			for (int i = 0; i < 10; i++) {
				if(i==2) {
					synchronized (String.class) {
						try {
							String.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(printThread);
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (String.class) {
			String.class.notify();
		}
	}
}
