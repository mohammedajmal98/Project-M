package collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "Karthik", "Mathematics", 95, "A"));
		student.add(new Student(2, "Ziyan", "Mathematics", 73, "B"));
		student.add(new Student(3, "Manish", "Mathematics", 88, "A"));
		student.add(new Student(4, "Ben", "Mathematics", 41, "C"));
		student.add(new Student(5, "Fayaz", "Mathematics", 79, "B"));
		
		//Q1 - Group the Students based on Grade
		Map<String, List<Student>> gradeWiseGrouping = 
						student.stream()
						.collect(Collectors.groupingBy(s->s.getGrade(), Collectors.toList())
						);
		
		System.out.println(gradeWiseGrouping);
		
		
		
		List<String> nameList = Arrays.asList("Kandha", "Mani", "Vijay", "Kandha", "Balaji"
				, "Mani", "Govindhan", "Balaji", "Lee", "Kandha");
		
		//Q2 - Print the duplicates alone
		List<String> yes = nameList.stream().distinct()
				.filter(e-> nameList.stream().filter(e::equals).count()>1)
				.collect(Collectors.toList());
		System.out.println(yes);
		
		//Q2 - Without using Streams
		Set<String> unique = new HashSet<>();
		Set<String> duplicate = new HashSet<>();
		
		for(String element : nameList){
			if(!unique.add(element)){
				duplicate.add(element);
			}
		}
		System.out.println(duplicate);
		
		
		//Q2 - Using Map
		Map<String, Long> countOfEach = nameList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countOfEach);
		
		List<String> yetAnotherDuplicateList = countOfEach.entrySet().stream()
							.filter(entry -> entry.getValue()>1)
							.map(n-> n.getKey())
							.collect(Collectors.toList());
		System.out.println(yetAnotherDuplicateList);
		
		
		//entrySet() is useful to get all entries from Map (both keys and values)
		
		
		
		
//		List<String> duplicateNames = nameList.stream()
//					.filter((s1) -> s1.length()>3)
//					.collect(Collectors.toList());
//		System.out.println(duplicateNames);
		
		
//		Set<String> uniqueNamesSet = nameList.stream().collect(Collectors.toSet());
//		System.out.println(uniqueNamesSet); 
//		
//		List<String> uniqueNamesList = nameList.stream().distinct().collect(Collectors.toList());
//		System.out.println(uniqueNamesList);
		
		
				

	}

}
