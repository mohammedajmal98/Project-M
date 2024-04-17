package d1ObjectsClassesMethodsEtc;

// LIBRARY MANAGEMENT SYSTEM
// It is not advisable to create many classes in single class file
class User{
	String name;
	int regNo;
	String password;
	
	public User(String name, int regNo, String password) {
		this.name = name;
		this.regNo = regNo;
		this.password = password;
	}
}

class Book{
	int bookId;
	String bookName;
	String bookGenre;
	
	public Book(int bookId, String bookName, String bookGenre) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookGenre = bookGenre;
	}	
}

class Card{
	int cardNo;
	String cardType;
	String cardHolderName;
	
	
}

public class O1ObjectsClasses {
	public static void main(String[] args) {
		
		//when creating objects using 'new' keyword, it sets every variable value to 'default'
		User user = new User("Ak",123,"456");
		Book book = new Book(789,"ABCDE","FGH");
		Card card = new Card();
		
		
		System.out.println(user.name);
		System.out.println(book.bookName);
		System.out.println(card.cardNo); //As it is not initialized, it sets to 'default' value 
		
		System.out.println(O2MethodProblems.digitSum(4345)); //Static method called from different class
		
	}
}
