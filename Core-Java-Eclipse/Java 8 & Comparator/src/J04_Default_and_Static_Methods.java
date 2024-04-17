/* Default Method:
Prior to java 8, interface in java can only have abstract methods. All the methods of interfaces 
are public & abstract by default. Java 8 allows the interfaces to have default and static methods. 
The reason we have default methods in interfaces is to allow the developers to add new methods to 
the interfaces without affecting the classes that implements these interfaces.
	Backward Compatibility: We can say that concept of default method is introduced in java 8 to 
add the new methods in the existing interfaces in such a way so that they are backward compatible.
Backward compatibility is adding new features without breaking the old code. (No need to implement/
override these new methods on our Classes that implemented this interface)
*/

/* Static Method:
Static methods in interfaces are similar to the default methods except that we cannot override 
these methods in the classes that implements these interfaces.
 */

interface MyInterface{  
    //This is a default method so we need not to implement this method in the implementation classes  
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    
    /* This is a static method. Static method in interface is similar to default method except 
that we cannot override them in the implementation classes. Similar to default methods, we need 
to implement these methods in implementation classes so we can safely add them to the existing interfaces.
 */
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
    /* Already existing public and abstract method. We must need to implement this method in 
     * implementation classes. */
    void existingMethod(String str);  
}  

//Below Interface for sample checking how it handles Multiple Inheritance. Check bottom comments for more detail
interface MyInterface2{
	default void newMethod(){  
        System.out.println("Newly added default method 22222222");  
    } 	
}

public class J04_Default_and_Static_Methods implements MyInterface, MyInterface2 {
	//abstract method implementation
	public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    } 
	
	//Override default method to avoid confusion of which Interface's method executes as both have same method signature
	//but Static method cannot be overridden
	public void newMethod(){
		System.out.println("Overridden Default Method");
	}
	
	public static void main(String[] args) {
    	J04_Default_and_Static_Methods obj = new J04_Default_and_Static_Methods();
    	
    	//calling the default method of interface
        obj.newMethod();    
        
        //calling the static method of interface
        MyInterface.anotherNewMethod();
        
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");     
	 }  
}
/* Abstract Classes vs Interfaces - abstract class can have constructor while in interfaces we can’t 
 * have constructors. The purpose of interface is to provide full abstraction, while the purpose of 
 * abstract class is to provide partial abstraction. 
 */

/*The multiple inheritance problem can occur, when we have two interfaces with the default methods 
 * of same signature. To resolve this, just implement/override the same duplicate method in our 
 * implemented Class.
 */

