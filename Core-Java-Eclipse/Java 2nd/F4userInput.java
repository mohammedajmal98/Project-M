import java.util.Scanner;

// Getting Input from user


public class F4userInput {

	public static void main(String[] args) {
		
		//System.in --> pre-defined object of input stream
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name? ");
		String name = sc.nextLine();
		
		System.out.println("Your rating from 1 to 5? ");
		short rating = sc.nextShort();   
		
		//Likewise, nextChar() is not there, So use sc.next.charAt(0);
		
		sc.nextLine(); //  after scanning numbers, use this to avoid skip reading email input
		
		System.out.println("Your email id? ");
		String email = sc.nextLine();     //sc.next() --> don't have that above problem          
		
		System.out.println("Hello " + name);
		System.out.println("Rating is " + rating);
		System.out.println("email is " + email);
		
		sc.close();
		
	}

}
