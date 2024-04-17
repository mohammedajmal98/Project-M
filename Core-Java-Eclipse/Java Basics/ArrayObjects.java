//Using Array for Object creation

class Student {
	int rollNo;
	String name;
}


public class ArrayObjects {

	public static void main(String[] args) {
		
		// Instead of creating below code 
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//Use this one
//		Student s[] = {s1,s2,s3};
		
		//Or use this
//		Student s[] = new Student[3];
//		s[0] = s1;
//		s[1] = s2;
//		s[2] = s3;
		
		
//		s1.name = "Johan";
//		s2.name = "Diana";
//		s3.name = "Jerry";
		
		
		
		System.out.println(s1.name + " " + s2.name + " " + s3.name);
		

	}

}
