//eclipse shortcut - ctrl+shift+x (to change selected part to uppercase)
//It is convention to mention all in UPPERCASE
public enum DaysOfTheWeek {
	SUNDAY(70, "Nice day"), 
	MONDAY(10, "Blues"), 
	TUESDAY(30, "Set"), 
	WEDNESDAY(50, "Perfect"), 
	THURSDAY(60, "Tired"), 
	FRIDAY(80, "Fun Mode"), 
	SATURDAY(100, "Have fun");
	
	//Enums can have fields but it should be intialized via constructors
	final int markForDays;	//'final' is used to avoid changed by other external in main()
	final String review;
	//can have many fields
	
	DaysOfTheWeek(int markForDays, String review) {
		this.markForDays = markForDays;
		this.review = review;
	}
}
