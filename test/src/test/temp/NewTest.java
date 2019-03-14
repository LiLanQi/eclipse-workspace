package test.temp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewTest {
	
	String currentTime;
	DisplayThread displayThread = new DisplayThread();
	private static final Object lockObject = new Object();
	
	public static void main(String[] args) {
		new NewTest().displayThread.start();
	}

	/**
	 * 该线程负责显示时间
	 */
	class DisplayThread extends Thread{
		
		@Override
		public void run() {
			synchronized (lockObject) {
				new TimeThread().start();
				try {
					lockObject.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(currentTime);//输出结果为什么一定不为null
			}
		}
	}

	/**
	 * 该线程负责获取时间
	 */
	class TimeThread extends Thread{
		
		@Override
		public void run() {
			synchronized (lockObject) {
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String pattern = "yyyy-MM-dd HH:mm:ss";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				currentTime = sdf.format(new Date());
				lockObject.notify();
			}
		}
	}
}
