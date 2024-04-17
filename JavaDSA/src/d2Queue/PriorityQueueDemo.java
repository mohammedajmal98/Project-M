package d2Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// Priority Queue -- A FIFO data structure that serves elements with the highest priority first
		// before elements with lowest priority
		
		
		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //to make it desc. order
		
		// default of Priority queue is 'Ascending Order'
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		
		

	}

}
