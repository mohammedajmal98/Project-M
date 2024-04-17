package busReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		//Bus buses[] = new Bus[50];     //Array of 'Bus' Objects
		//"ArrayList" is more efficient than "Array"
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,52));
		buses.add(new Bus(3,true,48));
		
		for(Bus b: buses){            //taking out "Objects" from arrayList
			b.displayBusInfo();
		}
		
		int userInput = 1;
		Scanner sc = new Scanner(System.in);
		
		while(userInput==1){
			System.out.println("Enter 1  to book & 2 to exit: ");
			
			userInput = sc.nextInt();
			if(userInput==1){
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)){
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");
				}
				else{
					System.out.println("Sorry, Bus is full. Try another bus/date.");
				}
			}	
		}
		sc.close();
	}
}
