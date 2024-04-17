package polymorphism;

public class Animal {
	private String name;
	private String color;
	
	public void eat(){
		System.out.println("munch");
	}
	
	//Method Overloading
	public void eat(int noOfTimes){
		for(int i=0; i<noOfTimes; i++){
			System.out.print("munch ");
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
