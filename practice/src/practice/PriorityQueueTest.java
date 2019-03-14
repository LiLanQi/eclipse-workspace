package practice;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<LocalDate> pq = new PriorityQueue<>();
		pq.add(LocalDate.of(1906,12,9));
		pq.add(LocalDate.of(1815,12,10));
		pq.add(LocalDate.of(1903,12,3));
		
		for(LocalDate date : pq) {
			System.out.println(date);
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}
}
