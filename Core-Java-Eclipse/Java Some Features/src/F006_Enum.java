//Enum - Enumeration -> Enum is used when we have pre-defined set of values that don't change
//Eg: Days of the week, Pi value etc.,

public class F006_Enum {

	public static void main(String[] args) {
		DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
		
		if(day == DaysOfTheWeek.THURSDAY){
			System.out.println("Yay! It's almost friday");
		}
		
		//Print all the elements of enum
		for(DaysOfTheWeek myDay : DaysOfTheWeek.values()){
			System.out.println(myDay);
		}
		System.out.println(DaysOfTheWeek.THURSDAY.markForDays);
		System.out.println(DaysOfTheWeek.SATURDAY.review);
	}

}
