package test;

public class InsertionSearch {

	public static void main(String[] args) {
		
		int array[] = {1,2,6,7,2,9,12,2};
		for(int i=1;i<array.length;i++) {
			int WillSortDate = array[i];
			int j;
			for(j=i;j>0 && array[j-1]>WillSortDate;j--) {
				array[j] = array[j-1];
			}
			array[j] = WillSortDate;
			for (int k : array) {
				System.out.println(k);
			}
		}
	}
}
