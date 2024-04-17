package pizzaBillGeneratorApp;

public class Pizza {
	
	private int price;
	private boolean veg;
	
	private int basePizzaPrice;
	private int extraCheese = 100;
	private int extraToppings = 150;
	private int takeAway = 20;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isTakeAwayOpted = false;
	
	public Pizza(boolean veg){
		this.veg = veg;
		if(this.veg){
			this.price = 300;	//veg
		}
		else{
			this.price = 400;	//non-veg
		}
		basePizzaPrice = this.price;
	}
	public void addExtraCheese(){
		isExtraCheeseAdded = true;
		this.price += extraCheese;
	}
	public void addExtraToppings(){
		isExtraToppingsAdded = true;
		this.price += extraToppings;
	}
	public void takeAwayCharge(){
		isTakeAwayOpted = true;
		this.price += takeAway;
	}
	public void getBill(){
		String bill = "";
		System.out.println("Pizza: " + basePizzaPrice); 
		
		if(isExtraCheeseAdded){
			bill += "Extra Cheese added: " + extraCheese + "\n";
		}
		if(isExtraToppingsAdded){
			bill += "Extra Toppings added: " + extraToppings + "\n";
		}
		if(isTakeAwayOpted){
			bill += "Take Away Charge: " + takeAway + "\n";
		}
		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);
		}
}
