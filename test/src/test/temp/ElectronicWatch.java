package test.temp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ElectronicWatch {
	
	String currentTime;
	
	public static void main(String[] args) {
		Object obj = new Object();//不能放在外面，除非是static
		new ElectronicWatch().new DisplayThread(obj).start();//内部类。。。
	}
	
	/**
	 * 该线程负责显示时间
	 */
	class DisplayThread extends Thread{

		private Object obj;
		
		public DisplayThread(Object obj) {
			this.obj = obj;
		}
		
		@Override
		public void run() {
			TimeThread timeThread = new TimeThread(obj);
			timeThread.start();
			synchronized (obj) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(currentTime);//为什么结果可能为null
		}
	}
	
	/**
	 * 该线程负责获取时间
	 */
	class TimeThread extends Thread{

		private Object obj;
		
		public TimeThread(Object obj) {
			this.obj = obj;
		}
		@Override
		public void run() {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			currentTime = sdf.format(new Date());
			synchronized (obj) {
				obj.notify();
			}
		}
	}
}

