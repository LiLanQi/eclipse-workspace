package test.temp;

public class Test {

	public static void main(String[] args) {
		Bike bike = new Bike();
		PersonThread xiaoLin =new PersonThread("小林",bike);
		xiaoLin.start();
		PersonThread xiaoWang =new PersonThread("小王",bike);
		xiaoWang.start();
	}
}

class PersonThread extends Thread{

	Bike bike;
	String name;
	
	PersonThread(String name, Bike bike){
		super(name);
		this.name = name;
		this.bike = bike;
	}
	
	@Override
	public void run() {//run方法执行表示正在骑车
		bike.move(name);
	}
}

class Bike{
	public synchronized void move(String personName){
		String threadName = Thread.currentThread().getName();
		System.out.println("当前线程线程："+threadName);//判断当前那条线程在执行该方法
		for (int i = 1; i <= 3; i++) {
			System.out.println(personName+":已经运行"+i+"秒");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


