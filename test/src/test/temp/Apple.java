package test.temp;

public class Apple{

	static int ans = 0;
	
	public static void main(String[] args) {
		Pop pop = new Apple().new Pop();
		Push push = new Apple().new Push();
		pop.start();
		push.start();
		while(true) {
			synchronized (String.class) {
				String.class.notify();
			}
		}
	}
	
	class Pop extends Thread{
		
		public void run() {
			while(true) {
				if(ans==0) {
					synchronized (String.class) {
						try {
							String.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					System.out.println("拿出来一个苹果，目前个数"+":"+(--ans));
				}
			}
		}
	}
	
	class Push extends Thread{
		
		public void run() {
			while(true) {
				if(ans==5) {
					synchronized (String.class) {
						try {
							String.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					System.out.println("放入一个苹果，目前个数"+":"+(++ans));
				}
			}
		}
	}
}
