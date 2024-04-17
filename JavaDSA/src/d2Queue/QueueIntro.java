package d2Queue;

import java.util.LinkedList;
import java.util.Queue;
 
public class QueueIntro {

	public static void main(String[] args) {

		// Queue --> FIFO data structure - First-In First-Out  eg: Linear Data Structure
		// 		A collection designed for holding elements prior to processing
		
		// Throws exception           Won't throw exception
		// add()  - enqueue()         offer() --> add to the 'tail' of the current queue
		// remove() - dequeue()       poll() -->remove the 'head' of the current queue
		// element() -                peek() - don't remove but return the 'head;
		
		// As 'Queue' extends 'Collections' Class, it can use 'Collection' class methods such as
		// queue.isEmpty() --> to check whether it is empty or not
		// queue.size() --> returns no. of objects in 'queue'
		// queue.contains("one") --> returns boolean

		Queue<String> queue = new LinkedList<String>(); // as 'Queue' is an interface, we use 'LinkedList Class'
		//that implements 'Queue' Interface
		
		
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		
		
		System.out.println(queue.peek());
		
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue.poll());
		
		System.out.println(queue);
		

		/* Uses:
		 * 1) Keyboard Buffer, Printers
		 * 2) Used in LinkedLists, Priority Queues, Breadth-First Search Algorithm
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */






	}

}
