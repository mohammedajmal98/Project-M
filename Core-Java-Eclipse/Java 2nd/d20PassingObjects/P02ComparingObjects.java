package d20PassingObjects;
//Comparing Objects by creating 'isEqual' method [blackBoard.isEqual(whiteBoard)]--> which returns 'boolean'
//

class Board {
	int length;
	int breadth;
	int height;
	
	Board(int l, int b, int h){                   
		length = l;
		breadth = b;
		height = h;
	}
	
	Board(Board b){					//Constructor to pass 'Objects'
		length = b.length;			//copy values from one object to other as it uses same 'reference'
		breadth = b.breadth;
		height = b.height;
	}
	
	boolean isEqual(Board wB){
		if(length==wB.length && breadth==wB.breadth && height==wB.height){  //length--> blackBoard length
			return true;													//wB.length--> whiteBoard length
		}
		return false;
	}
}

public class P02ComparingObjects {

	public static void main(String[] args) {
		Board blackBoard = new Board(2,3,4);
		Board whiteBoard = new Board(7,3,4);
		
		System.out.println(blackBoard.isEqual(whiteBoard));  //comparing values of both objects
		
		//to directly passing one object values to another new object
		Board greyBoard = new Board(whiteBoard);
		System.out.println(greyBoard.length);

	}

}
