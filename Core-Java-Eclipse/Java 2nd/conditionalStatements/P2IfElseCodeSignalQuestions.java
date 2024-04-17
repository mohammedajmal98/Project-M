package conditionalStatements;

public class P2IfElseCodeSignalQuestions {
	
	//Problem 1
	boolean reachNextLevel(int experience, int threshold, int reward){
		return experience+reward>=threshold;  //returns 'true' if condition is satisfied or 'false' if failed
	}
	//Problem 2
	int extraNumber(int a, int b, int c){ 
		return (a==b)?c:(b==c)?a:b;           // should return 'Unique' value
	}
	
	//Problem 3 -- to check if any combination of 'a' & 'b' gives 'c'  
	boolean arithmeticExpression(int a, int b, int c){
		if ((a+b==c) || (a-b==c) || (a*b==c) || (a/b==c && a%b==0)) //In division, modulus is given if
			return true;
		return false;
	}//In division, modulus is given for safety purpose. It may take 8/3 = 2,(wont consider decimal points)

	//Problem 3 -- Type 2
	boolean arithmeticExpressionType2(int a, int b, int c){
		return (a+b==c)?true:(a-b==c)?true:(a*b==c)?true:(a/b==c && a%b==0)?true:false;	
	}
	
	public static void main(String[] args) {
		P2IfElseCodeSignalQuestions check1 = new P2IfElseCodeSignalQuestions();
		
		System.out.println(check1.reachNextLevel(100,105,5));  //Problem 1
		
		System.out.println(check1.extraNumber(2,9,2));         //Problem 2
		
		System.out.println(check1.arithmeticExpression(5, 10, 15));  //Problem 3
		
		System.out.println(check1.arithmeticExpressionType2(8, 3, 2)); //Problem 3 (type 2)
		
		

	}

}
