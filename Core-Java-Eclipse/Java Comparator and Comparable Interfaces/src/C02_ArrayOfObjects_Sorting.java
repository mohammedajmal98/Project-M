import java.util.Arrays;

public class C02_ArrayOfObjects_Sorting {

	public static void main(String[] args) {
//		Employee employee = new Employee(339, "Shyam", 23, 25000);
//		System.out.println(employee);
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(339, "Shyam", 23, 25000);
		empArr[1] = new Employee(333, "Vincent", 47, 35000);
		empArr[2] = new Employee(336, "Khan", 19, 10000);
		empArr[3] = new Employee(334, "Manoj", 66, 90000);
		
		Arrays.sort(empArr); //Gives runtime exception as it couldn't sort. (don't know sort on which basis)

	}

}

class Employee{
	private int id;
	private String name;
	private int age;
	private long salary;
	
	public Employee(int id, String name, int age, long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}	
}
