package pizzaBillGeneratorApp;

public class Main {

	public static void main(String[] args) {
		Pizza basePizza1 = new Pizza(false);
		basePizza1.addExtraCheese();
		basePizza1.getBill();
		
		DeluxePizza basePizza = new DeluxePizza(true);
		basePizza.addExtraCheese();
		basePizza.getBill();
		
	}

}
