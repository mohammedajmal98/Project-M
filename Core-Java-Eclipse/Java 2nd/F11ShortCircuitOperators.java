
public class F11ShortCircuitOperators {

	public static void main(String[] args) {
		// &&, || --> Short Circuit operators won't check the second condition if the first 
		// condition gives enough information
		// for 'OR' --> If 1st one is true, no need to check 2nd one (Answer is 'true')
		// for 'AND' --> If 1st one is false, no need to check 2nd one- (Answer is 'false')
		
		int a = 44;
		int b = 55;
		
		System.out.println((a>30 && a<60));
		System.out.println((a>50 || a<b));
		

	}

}
