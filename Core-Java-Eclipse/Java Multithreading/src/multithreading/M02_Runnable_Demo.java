package multithreading;

//Why Runnable over Thread Class? 
// Because of Multiple Inheritance problem in Java, we can use use Runnable Interface along with to
//extend any other class. But with extends Thread Class, we can't extend any other Class.   

//Useful Methods - 
//		join() -> wait for the particular thread to finish before starting another
//		isAlive() -> return boolean whether Thread is currently still running or not

public class M02_Runnable_Demo {

	public static void main(String[] args) {
		for(int i = 1; i<4; i++){
			RunnableCheck runnable = new RunnableCheck(i);
			Thread myThread = new Thread(runnable);
			myThread.start();
			try {
				myThread.join();	//It stops executing another thread before the completion of this thread
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Just doing");
	}

}

class RunnableCheck implements Runnable{
	private int threadNo;	//to check from which Thread, error occurs
	public RunnableCheck (int threadNo){
		this.threadNo = threadNo;
	}

	@Override
	public void run(){
		for(int i = 1; i<=5; i++){ 
			System.out.println(i + " from Thread " + threadNo);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace(); //It just prints the line where error occurs
			}
		}
	}
}
