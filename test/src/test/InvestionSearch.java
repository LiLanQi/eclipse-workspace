package test;

public class InvestionSearch {

	public static void main(String[] args) {
		
		int array[] = {1,2,6,7,2,9,12,2};
		for(int D=array.length/2;D>0;D/=2) {
			for(int i=D;i<array.length;i++) {
				int j;
				int WillSortDate = array[i];
				for(j=i;j>D && array[j-D]>WillSortDate;j-=D) {
					array[j] = array[j-D];
				}
				array[j] = WillSortDate;
			}
		}
		for (int i : array) {
			System.out.println(i);
		}
	}
}
