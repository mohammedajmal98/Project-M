package polymorphism;

public class Dog extends Animal {
	
	private String breed;
	
	public void eat(){
		System.out.println("Chomp Chomp");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
