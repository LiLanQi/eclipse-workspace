package test.temp;

public class DeadLockThread {
	// 创建两个线程之间竞争使用的对象
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	public static void main(String[] args) {
		new ShareThread1().start();
		new ShareThread2().start();
	}

	private static class ShareThread1 extends Thread {
		public void run() {
			synchronized (lock1) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("ShareThread1");
				}
			}
		}
	}

	private static class ShareThread2 extends Thread {
		public void run() {
			synchronized (lock2) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("ShareThread2");
				}
			}
		}
	}
}
