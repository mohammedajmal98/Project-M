package e07Reflection;

//Reflection -> Useful for getting unknown Class/Methods Information using Object
//Due to security issues and poor performance, we don't use it frequently.

import java.lang.reflect.*;

public class Reflection {

	public static void main(String[] args) {
		
		 Test t = new Test(); 
		 //Sometimes we get Objects but we don't know Class/Method Information. At that time, Reflection is used
		 
		 Class cls = t.getClass();	//to store the "Class" information in cls
		 
		 System.out.println("Class Name: " + cls.getName());
		 
		 
		 Method[] methods = cls.getMethods(); //to get all the methods and store in "methods" 
		 // "Method" is inbuilt class already written in Reflection package
		 for(Method m: methods){
			 System.out.println(m.getName());
		 }
		 
		 //We can also "invoke" the methods using "Reflection"
		 try {
			System.out.println(methods[0].invoke(t,null));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//Some other Methods of Reflection: getConstructor(), getDeclaredMethod(), getDeclaredField() etc.,

	}

}
