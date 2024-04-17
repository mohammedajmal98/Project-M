package multithreading;

/*Thread - A thread is an independent sequential path of execution within a program. Many threads
 * can run concurrently within a program.
 * 
 * At runtime, threads in a program exist in a common memory space and can, therefore, share both
 * data and code (i.e., they are lightweight compared to processes). They also share the process running
 * the program.
 * 
 * 
 * 3 important concepts related to Multithreading in Java:
 * 		1) Creating Threads and providing the code that gets executed by a Thread.
 * 		2) Accessing common data and code through Synchronization.
 * 		3) Transitioning between Thread States.
 * 
 * 
 * 
 * Main Thread:
 * 		When a standalone application is run, a user thread is automatically created to execute
 * the main() method of the application. This thread is called main thread.
 * 		If no other user threads are spawned, the program terminates when the main() method 
 * finishes executing.
 * 		All other threads , called Child Threads, are spawned from the main thread. 
 * 		The main() methods can then finish, but the program will keep running until all user threads 
 * have completed.
 * 		The runtime environment distinguishes between user threads and daemon threads.
 * 
 * NOTE: If all user threads completed running (main thread is also a user thread), the program
 * will stop irrespective of whether Daemon threads are running or not.
 * 
 * 
 * Daemon Thread:
 * Daemon thread is a low priority thread (in context of JVM) that runs in background to perform 
 * tasks such as garbage collection (gc) etc., they do not prevent the JVM from exiting (even if the 
 * daemon thread itself is running) when all the user threads (non-daemon threads) finish their 
 * execution.
 * 	setDaemon(boolean) -> can make a user thread to Daemon by using setDaemon() method of thread class.
 * 						  But, it must be done before thread starts.
 * 
 * 
 * Thread Creation: 
 * 		A Thread in Java is represented by an Object of the Thread Class
 * Creating Threads is achieved in one of two ways:
 * 		1) Implementing the java.lang.Runnable interface
 * 		2) Extends the java.lang.Thread class
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class M03_Thread_Definitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
