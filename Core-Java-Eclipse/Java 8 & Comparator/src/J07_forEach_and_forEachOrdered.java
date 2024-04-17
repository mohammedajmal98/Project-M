import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//forEach()-> to iterate over Collections (List, Map etc.,) and Streams in Java
//forEachOrdered() -> For sequential streams the order of elements is same as the order in the source,
//	so the output would be same whether you use forEach or forEachOrdered. However when working with 
//	parallel streams, you would always want to use the forEachOrdered() method when the order matters 
//	to you, as this method guarantees that the order of elements would be same as the source. 

public class J07_forEach_and_forEachOrdered {

	public static void main(String[] args) {
		
		//forEach to iterate a list (same as to iterate a stream)
		List<Double> values = new ArrayList<>(Arrays.asList(35d,44d,66d,77d));
		values.forEach(n -> System.out.println(n/2));
		
		//forEach to iterate a Map
		//Map<String, Integer> game = Map.of("Cricket", 11, "Chess", 2, "Carrom", 4); //,can use in Java 9 and above
		Map<String, Integer> game = new HashMap<>();
		game.put("Cricket", 11);	game.put("Chess", 2);	game.put("Carrom", 4); 
		game.forEach((k,v) -> System.out.println(k + " - " + v));
		
		game.forEach((k,v) -> { 
			if(v%2==0){
				System.out.println(k);
			}
		});
		
		game.forEach((k,v) -> {
			if("Cricket".equals(k)){
				System.out.println("Number of players in Cricket: " + v);
			}
		});
		
		//forEachOrdered()
		List<String> hobbies = new ArrayList<>(Arrays.asList(
				"Listening to Music", "Playing Cricket", "Reading Books"));
		
		hobbies.stream().parallel().forEach(n -> System.out.print(n + " "));
		System.out.println();
		hobbies.stream().parallel().forEachOrdered(n -> System.out.print(n + " "));	
	}

}
