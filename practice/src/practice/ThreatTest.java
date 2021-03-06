package practice;

public class ThreatTest {
	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("线程启动");
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("线程没有被中断");
				try {
					Thread.currentThread().sleep(1000);
					Thread.currentThread().interrupt();
					if(Thread.currentThread().isInterrupted()){
						System.out.println(Thread.currentThread().getState());
						System.out.println("线程被中断");
					}
					Thread.currentThread().interrupted();
					if(Thread.currentThread().isInterrupted()){
						System.out.println("线程依然被中断");
					}
					if(!Thread.currentThread().isInterrupted()){
						System.out.println("线程中断状态被置位");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}
}
