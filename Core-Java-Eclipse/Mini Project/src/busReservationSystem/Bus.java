package busReservationSystem;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;   //'get' and 'set' methods
	
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;	
	}

	public int getCapacity() {           //'accessor' method
		return capacity;
	}

	public void setCapacity(int cap) {   //'mutator' method
		capacity = cap;
	}

	public int getBusNo() {
		return busNo;
	}							//setBusNo - no need as it is fixed

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus No: " + busNo + " AC: " + ac + " Capacity " + capacity);
	}
}
