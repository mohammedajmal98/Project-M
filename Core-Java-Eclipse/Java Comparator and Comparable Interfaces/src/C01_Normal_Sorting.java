import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01_Normal_Sorting {

	public static void main(String[] args) {
		
		//Sorting primitive
		int arrInt[] = {12, 8, 17, 5, 1};
		Arrays.sort(arrInt);
		System.out.println(Arrays.toString(arrInt));
		
		//Sorting String
		String arrStr[] = {"Vijay", "Ajay", "Abay", "Babu"};
		Arrays.sort(arrStr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrStr));
		
		//Sorting list of Objects of Wrapper Classes
		List<String> listStr = new ArrayList<>();
		listStr.add("Class");	listStr.add("Atlas");	listStr.add("Abacus");	listStr.add("busy");
		Collections.sort(listStr);
		System.out.println(listStr);
		
		Collections.sort(listStr, Collections.reverseOrder());
		System.out.println(listStr);
	}

}
