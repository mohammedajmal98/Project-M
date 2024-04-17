package multithreading;

//Two ways of creating a new Thread
//	1) extends Thread Class
//	2) implements Runnable Interface

// In Multithreading - no guarantee which Thread doing first (running at the same time independently)
// Exception - If one thread faces exception, it won't affect other threads from running
//		Applies to Main thread too.

public class M01_Multithreading {

	public static void main(String[] args) {
//		ThreadDemo thread1 = new ThreadDemo();
//		ThreadDemo thread2 = new ThreadDemo();
//		
//		thread1.start();	//It calls the overridden run() method
//		thread2.start();
//		//Now both threads work simultaneously
//		
		//Creating 3 threads using for loop
		for(int i = 1; i<4; i++){
			ThreadDemo thread = new ThreadDemo(i);
			thread.start();
		}
//		throw new RuntimeException(); //It won't disturb the execution of other threads
		
		//System.err.println("HIIIIIII"); //(Just prints in red color in console to highlight "error"

	}

}

class ThreadDemo extends Thread{
	private int threadNo;	//to check from which Thread, error occurs
	public ThreadDemo (int threadNo){
		this.threadNo = threadNo;
	}
	
	@Override //Overrides Thread's run method
	public void run(){
		for(int i = 1; i<=5; i++){ 
//			if(threadNo==2){ //If one thread faces exception, it won't affect other threads from running
//				throw new RuntimeException();
//			}
			System.out.println(i + " from Thread " + threadNo);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); //It just prints the line where error occurs
			}//set timing (wait for n milliseconds) to go to print next number
		}
	}
}
