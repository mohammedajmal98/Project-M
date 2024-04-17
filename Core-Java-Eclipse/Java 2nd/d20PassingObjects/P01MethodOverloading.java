package d20PassingObjects;

//Method Overloading, Constructor Overloading, Passing Objects, Passing References, Returning Objects

//Math.abs(numeric value) --> gives absolute value(+ve)

class Box{
	int length;
	int breadth;
	int height;
	
	Box(){                   //No-arg constructor
		length = -1;
		breadth = -1;
		height = -1;
	}
	
	Box(int cubeValue){      //1-arg constructor
		length=breadth=height=cubeValue;
	}
	
	Box(double value){       //It initializes "0" to all as value is not set	
	}
}

public class P01MethodOverloading {
	public static void main(String[] args) {
		
		Box b1 = new Box();
		System.out.println(b1.length);
		
		Box b2 = new Box(12);
		System.out.println(b2.breadth);
	}
}
