package d20PassingObjects;

class Board1 {
	int length;
	int breadth;
	int height;
	
	Board1(int l, int b, int h){                   
		length = l;
		breadth = b;
		height = h;
	}
	
	Board1(Board1 b){					//Constructor to pass 'Objects'
		b.length++;               //whiteBoard.length is incremented as it is passing 'reference'(memory location)
		length = b.length;			
		breadth = b.breadth;
		height = b.height;
	}
}

public class P04PassingReferences2 {

	public static void main(String[] args) {
		
			Board1 whiteBoard = new Board1(7,3,4);
			System.out.println(whiteBoard.length);
			
			Board1 greyBoard = new Board1(whiteBoard);
			System.out.println(greyBoard.length);   //this length changed the length of whiteboard
			System.out.println(whiteBoard.length);
	}
}


