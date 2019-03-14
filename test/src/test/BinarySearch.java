package test;

public class BinarySearch {

	public static void main(String[] args) {
		int []numbers = {1,2,3,4,5,6,7,8,9,10};
		int min = 0;
		int max = numbers.length-1;
		int data = 3;
		while(min<=max) {
			int mid= (max+min)/2;
			if(data>numbers[mid]) {
				min = mid+1;
			}
			else if(data<numbers[mid]) {
				max = mid-1;
			}
			if(data==numbers[mid]) {
				break;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
