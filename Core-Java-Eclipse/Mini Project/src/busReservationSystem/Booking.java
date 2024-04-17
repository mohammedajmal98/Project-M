package busReservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//This package has 'Date' class which is already defined in it && It also covers 'Scanner' class
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date date;     //Create an 'Object' of 'Date' class in util package
	
	Booking(){		//'Constructor' not only initialize but can also get data from 'Scanner'
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the passenger: ");
		passengerName = sc.next();
		
		System.out.println("Enter Bus No: ");
		busNo = sc.nextInt();
		
		//Getting date from user as 'String' and convert it 'Date' format using "SimpleDataFormat" class
		//& parse method
		System.out.println("Enter date (dd-mm-yyyy): ");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  //sets the 'date format'
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
		int capacity = 0;
		for(Bus bus : buses){
			if(bus.getBusNo() == busNo){
				capacity = bus.getCapacity();
			}
		}
		
		int booked = 0;
		for(Booking b : bookings){
			if(b.busNo==busNo && b.date.equals(date)){
				booked++;
			}	
		}
		
		return booked<capacity?true:false;
	}	
}
