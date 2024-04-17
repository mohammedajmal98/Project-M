package e02IO;

import java.io.File;
import java.io.IOException;

public class E02FileCreation {

	public static void main(String[] args) {
		try{
			File file = new File("C:\\Users\\2145812\\Downloads\\Newfile.txt");
			boolean check = file.createNewFile();
			if(check){
				System.out.println("File created successfully");
			}
			else{
				System.out.println("File is already present");
			}
		}
		catch(IOException e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
		}
	}
}
