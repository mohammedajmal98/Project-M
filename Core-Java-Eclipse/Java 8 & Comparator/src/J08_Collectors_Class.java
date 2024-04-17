import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// Collectors is a final class that extends the Object Class. 
//			java.lang.Object <-- java.util.stream.Collectors
//Collectors Methods: averageInt(n), toList(), toSet(), groupingBy(Function.identity(), Collectors.counting())
//		

public class J08_Collectors_Class {

	public static void main(String[] args) {
		
		//Stream Collectors of fetching data as List
		List<Student> students1 = new ArrayList<>(Arrays.asList(
						new Student(11,"Jon",22),
						new Student(22,"Steve",18),
						new Student(33,"Adam",25),
						new Student(44,"Adam",35)));
		List<String> result1 = students1.stream().map(n -> n.name).collect(Collectors.toList());
		System.out.println(result1);
		
		//Stream Collectors of fetching data as Set
		List<Student> students2 = new ArrayList<>(Arrays.asList(
				new Student(11,"Jon",22),
				new Student(22,"Steve",18),
				new Student(33,"Adam",25),
				new Student(44,"Adam",35)
		));
		
		Set<String> result2 = students2.stream().map(n -> n.name).collect(Collectors.toSet());
		Set<String> result3 = students2.stream().filter(n -> n.id>22).map(n -> n.name)
																	.collect(Collectors.toSet());
		System.out.println(result2);
		System.out.println(result3);
		
		
		//Collectors.averageInt() method example
		double avg;
		//double avg = students1.stream().collect(Collectors.averagingInt(n -> n.age));
		System.out.println(avg = students1.stream().collect(Collectors.averagingInt(n -> n.age)));
		
		
		
		//Collectors.groupingBy() method example -> we are grouping the elements of a list using 
		//groupingBy() method of Collectors class and printing the occurrences of each element in the list.
//Need to use Map to store the values
		List<String> alphabets = new ArrayList<>(Arrays.asList("M","O","H","A","M","M","E","D"));
		
		Map<String, Long> count = alphabets.stream().collect(
				Collectors.groupingBy(
						Function.identity(), Collectors.counting()
				)
		);
		System.out.println(count);
		
	}

}

class Student{  
	   int id;     
	   String name;    
	   int age;         
	   public Student(int id, String name, int age) {  
	        this.id = id;    
	        this.name = name;         
	        this.age = age;     
	   } 
}
