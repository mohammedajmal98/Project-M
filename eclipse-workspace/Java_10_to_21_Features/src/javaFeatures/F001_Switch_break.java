package javaFeatures;

public class F001_Switch_break {

	public static void main(String[] args) {
		String day = "Sun";
		String time = "";
		
		//Instead of this
//		switch(day){
//			case "Sat", "Sun":
//				time = "6am";
//				break;
//			case "Wed":
//				time = "11am";
//				break;
//			default:
//				time = "8am";	
//		}
		
		//No need to put 'break', mention as lambda expression
//		switch(day) {
//		case "Sat", "Sun" -> time = "6am";
//		case "Wed" -> time = "11am";
//		default -> time = "8am";
//		}
		
		//can make Switch statements to Switch expression (add ';' at end)
//		time = switch(day) {
//		case "Sat", "Sun" -> "6am";
//		case "Wed" -> "11am";
//		default -> "8am";
//		}; //Statements don't need ';', but Expression needs ';'
		
		//Want to use colon instead of arrow in expression -> use yield
		time = switch(day) {
		case "Sat", "Sun": yield "6am";
		case "Wed": yield "11am";
		default: yield "8am";
		}; //yield just put out whatever value next to it 
		
		
		
		
		
		
		
		
		System.out.println(time);

	}

}
