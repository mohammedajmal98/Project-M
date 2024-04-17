package pizzaBillGeneratorApp;

public class DeluxePizza extends Pizza {
	public DeluxePizza(boolean veg){
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}
	
	//To avoid double addition to bill
	public void addExtraCheese(){	
	}
	public void addExtraToppings(){	
	}
	

}
