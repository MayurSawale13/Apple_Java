package stacknqueue;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue <Integer> pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);

	}

}
