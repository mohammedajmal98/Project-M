//If an Interface has only one abstract method, it is called SAM Interface(Single Abstract Method) or Functional Interface
//If it is a functional interface, we can use Lambda Expression -> From Java 8(1.8)
//Default methods can be more, but abstract method should be one

interface Art{
	void painting();
}

public class F16LambdaExpression {
	public static void main(String[] args) {
		
		Art a1 = new Art(){			//It is "Anonymous Class"
			public void painting(){
				System.out.println("Painting is an Art");
			}
		};
		
		a1.painting();
		
		//Lambda Expression - Interface must be a functional Interface
		Art a2 = () -> System.out.println("Painting is not an Art");	//Implement the method to be overridden
		
		a2.painting();
			
	}

}
