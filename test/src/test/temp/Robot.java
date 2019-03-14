package test.temp;

public class Robot {
	
	static Robot robot = new Robot();
	
	public static void main(String[] args) {
		
		Runnable robotC = ()->{
			System.out.println("贴标签...");
			synchronized (String.class) {
				String.class.notify();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("贴标签完毕");
		};
		
		Runnable robotB = ()->{
			System.out.println("盖盖子...");
			new Thread(robotC).start();
			synchronized (Integer.class) {
				try {
					Integer.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("盖盖子完毕");
		};
		
		Runnable robotA = ()->{
			System.out.println("放药...");
			synchronized (String.class) {
				new Thread(robotB).start();
				try {
					String.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("放药完毕");
			synchronized (Integer.class) {
				Integer.class.notify();
			}
		};
		
		System.out.println("开始向盒子中放药");
		Thread t = new Thread(robotA);
		t.start();
	}
}
