package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("a");
		pq.add("L");
		pq.add("A");
		pq.add("M");
		pq.add("C");
		pq.add("Y");
		
		pq.add(null);
		
		System.out.println(pq);
		
		
		
		
	}

}
