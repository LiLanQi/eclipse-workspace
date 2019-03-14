package test;

public class Bubble {

	public static void main(String[] args) {
		int []numbers = {2,3,5,7,8,4,6};
		for(int loopTime=1;loopTime<numbers.length;loopTime++) {
			for(int i=0;i<numbers.length-loopTime;i++) {
				int current = numbers[i];
				int next = numbers[i+1];
				if(current>next) {
					numbers[i]=next;
					numbers[i+1]=current;
				}
			}
		}
		for(int number:numbers) {
			System.out.println(number);
		}
		
	}

}
