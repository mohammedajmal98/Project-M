
public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 8; i++) {
			if (i == 4) {
				continue; // check with break;
			}
			System.out.println("I am " + i);
		}

	}

}
