package javaFeatures;

import java.util.ArrayList;

//var also called as 'LVTI' (Local Variable Type Inference)
//var can only be used as 'Local Variable' not as 'Instance Variable or Static Variable'
//Also, var becomes the keyword in Java (can't use in name of Class, Methods nomore)

public class F002_var {

	public static void main(String[] args) {
		//It can automatically gets the type from the right side
		var names = new ArrayList<>();
		
		names.add(9); //Consider it as Integer array
		names.add("Hi String"); //Now, considers it as String Array
		
		System.out.println(names);
		
		//Can also write like this for type safe (to only allow String values)
//		var names2 = new ArrayList<String>();
		
		
		var num = 99;	//Compiler automatically thinks that it is int.
		num = 100;
		//Still java is strong & static typed only
//		num = "hii";	//causes error as Compiler thinks that it is int.
		System.out.println(num);
	}

}
