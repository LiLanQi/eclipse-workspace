package test;
import java.util.Scanner;
class Main{

	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int []number = new int[N];
		int count = 0;
		for(int i=2;count<N;i++) {
			if(isSuShu(i)) {
				number[count] = i; 
				count++;
			}
		}
		for(int i=M;i<=N;i++) {
			if((i-M+1)%10==0 && i!=M) {
				System.out.println(number[i-1]);
			}
			else if(i==N)
				System.out.print(number[i-1]);
			else {
				System.out.print(number[i-1]+" ");
			}
		}		
		
	}
	
	static boolean isSuShu(int number){
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
		
}