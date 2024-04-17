package e01Multithreading;
//'Listening Audio' is a process. There are many threads inside a 'process'
//'Using Eclipse' with 'Listening Audio' is "Multiprocessing"
//Multithreading - The process of executing multiple threads simultaneously

/* 
1) Thread - It is a light-weight smallest part of a process that can run concurrently with the other parts
(other threads) of the same process.
2) Threads are independent because they all have seperate path for execution that's the reason if an exception
occurs in one thread, it won't affect execution of other threads.
3) All threads of a process share the common memory.

Two ways to create a thread in Java:
1) By extending 'Thread' class
2) By implementing 'Runnable' interface

Methods of 'Thread' class:
1) getName() - used for obtaining a thread's name.
2) getPriority() - obtain a thread's priority (setPriority(), MIN_PRIORITY, MAX_PRIORITY, NORM_PRIORITY
3) isAlive() - to determine if a thread is still running
4) join() - Wait for a thread to terminate
5) run() - Entry point for the thread
6) sleep() - suspend a thread for a period of time
7) start() - start a thread by calling its run() method
*/

public class M01Multithreading {
	public static void main(String[] args) {
		System.out.println("hii");
		
		
		
	}

}

//Pros - Efficient use of processors, Performance, Better UI response
//Cons - Unexpected results, Deadlocks, Performance (Thread Scheduler needs much effort to properly schedule 
//threads to the processor
