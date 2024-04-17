import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's ur name?");
		String name = sc.nextLine();
		
		System.out.println("What's ur age?");
		double age = sc.nextDouble();
		
		sc.nextLine();  // to avoid autofill 'enter'(whitespace as input) for petName as it is having
		// nextLine method after nextInt or nextDouble etc.,
		
		System.out.println("What's ur pet name in one word?");
		String petName = sc.nextLine();
		
		System.out.println("What's ur age?");
		double age2 = sc.nextDouble();
		
		System.out.println("Hello " + name);
		System.out.println("Your age is " + age);
		System.out.println("Ur pet name is " + petName);
		System.out.println("Your age is " + age2);
	}

}
