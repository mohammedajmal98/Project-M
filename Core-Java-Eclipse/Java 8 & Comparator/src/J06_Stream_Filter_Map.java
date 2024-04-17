import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J06_Stream_Filter_Map {

	public static void main(String[] args) {
		//filter() ->  the stream filter transforms the data of one stream into another stream.
		//collect(Collectors.toList());  // collect the final stream and convert it to a List
		List<String> names = new ArrayList<>(Arrays.asList("Ajay","Anand","Akash","Adhavan","Balan"));
		
		List<String> filteredNames = names.stream().
												filter(n -> n.length()>4 && n.length()<6).
												filter(n->n.startsWith("B")).
												map(n-> "Final: " + n).
												collect(Collectors.toList());
		filteredNames.forEach(System.out::println);

	}

}
