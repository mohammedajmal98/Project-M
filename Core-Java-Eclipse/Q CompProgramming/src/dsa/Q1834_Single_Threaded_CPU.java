package dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q1834_Single_Threaded_CPU {
	public static void main(String[] args) {
		int[][] tasks = {{1,2}, {2,4}, {3,2}, {4,1}};	//tasks[i] = [enqueueTime, processingTime]
		//Expected Output - [0,2,3,1]
		
		System.out.println(Arrays.toString(getOrder(tasks)));
	}

	
	 public static int[] getOrder(int[][] tasks) {
	        int n = tasks.length;
	        Queue<Task> taskQueue = new PriorityQueue<>((task1, task2) -> task1.startTime - task2.startTime); 
	        
	        Queue<Task> availableQueue = new PriorityQueue<>(new SortByProcessingTime());
	        
	        for (int i = 0; i < n; i++) {
	            taskQueue.add(new Task(i, tasks[i][0], tasks[i][1]));
	        }
	        
	        int[] ans = new int[n];
	        int currTime = taskQueue.peek().startTime;
	        
	        for (int i = 0; i < n;) {
	            while (!taskQueue.isEmpty() && taskQueue.peek().startTime <= currTime) {
	                availableQueue.add(taskQueue.poll());
	            }
	            if (!availableQueue.isEmpty()) {
	                Task t = availableQueue.poll();
	                currTime += t.processingTime;
	                ans[i++] = t.index;	//'i' is post incremental (After the execution of statement only, i will increment)
	            }
	            else {
	                currTime = taskQueue.peek().startTime;
	            }
	        }
	        
	        return ans;
	    }
}

class Task {
    int index; 
    int startTime;
    int processingTime;
    
    Task(int index, int startTime, int processingTime) {
        this.index = index;
        this.startTime = startTime;
        this.processingTime = processingTime;
    }
}



class SortByProcessingTime implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        if (t1.processingTime == t2.processingTime) return t1.index - t2.index;
        
        return t1.processingTime - t2.processingTime;
    }
}

/* Intuition:

Maintain 2 priority queues.
First queue maintains ordering of tasks by enqueueTime (from low to high).
Second queue maintains ordering of tasks by processingTime (from low to high) and index (low to high).
Now we take tasks out of taskQueue and put it in availableQueue.
From availableQueue, we process each task one by one

*/




