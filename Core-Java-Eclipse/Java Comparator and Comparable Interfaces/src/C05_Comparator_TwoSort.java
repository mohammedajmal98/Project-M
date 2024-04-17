import java.util.Arrays;
import java.util.Comparator;

public class C05_Comparator_TwoSort {

	public static void main(String[] args) {
		
		Employee4[] empArr = new Employee4[6];
		empArr[0] = new Employee4(339, "Shyam", 23, 25000);
		empArr[1] = new Employee4(333, "Vincent", 47, 35000);
		empArr[2] = new Employee4(336, "Khan", 19, 10000);
		empArr[3] = new Employee4(334, "Manoj", 66, 90000);
		empArr[4] = new Employee4(333, "Siraj", 17, 9000);
		empArr[5] = new Employee4(336, "Virat", 96, 100000);
		
		Arrays.sort(empArr, Employee4.SalaryComparator);
		System.out.println("Employee List sorted by Salary\n" + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee4.NameComparator);
		System.out.println("Employee List sorted by Name\n" + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee4.IdthenNameComparator);
		System.out.println("Employee List sorted by ID then Name\n" + Arrays.toString(empArr));
		
		//Seperate class comparator called by creating Object
		Arrays.sort(empArr, new AgeComparator());
		System.out.println("Employee List sorted by Age\n" + Arrays.toString(empArr));

	}

}

class Employee4 { //No need to implement Comparable

    private int id;
    private String name;
    private int age;
    private long salary;

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

    public Employee4(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	//Creating Comparators here itself as Anonymous Class
	// Based on Salary
	public static Comparator<Employee4> SalaryComparator = new Comparator<Employee4>(){
		@Override
        public int compare(Employee4 e1, Employee4 e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
	};
	
	//Based on Name
	public static Comparator<Employee4> NameComparator = new Comparator<Employee4>() {
        @Override
        public int compare(Employee4 e1, Employee4 e2) {
            return e1.getName().compareTo(e2.getName());
        }
	 };
	 
	 //Here is the implementation of Comparator interface that will compare two Employees object 
	 //first on their id and if they are same then on the name.
	 public static Comparator<Employee4> IdthenNameComparator = new Comparator<Employee4>(){
		@Override
        public int compare(Employee4 e1, Employee4 e2) {
            int flag = e1.getId() - e2.getId();
            if(flag == 0){
            	flag = e1.getName().compareTo(e2.getName());
            }
            return flag;
        }
	 };   
}
//separate class implementation of Comparator interface
class AgeComparator implements Comparator<Employee4> {

    @Override
    public int compare(Employee4 e1, Employee4 e2) {
        return e2.getAge()-e1.getAge();	//Descending Order
    }

}
