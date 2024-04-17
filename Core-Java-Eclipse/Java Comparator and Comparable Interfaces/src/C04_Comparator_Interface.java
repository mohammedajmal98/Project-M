import java.util.Arrays;
import java.util.Comparator;

//Comparator - compare(Object o1, Object o2)
// We can create Comparator and implement compare() method in any Class even Anonymous Class.
// But in Comparable Interface, we must implement compareTo() in the related class.

public class C04_Comparator_Interface {
	
	//Creating Comparators here itself as Anonymous Class
	// Based on Salary
	static Comparator<Employee3> SalaryComparator = new Comparator<Employee3>(){
		@Override
        public int compare(Employee3 e1, Employee3 e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
	};
	//Based on Name
	public static Comparator<Employee3> NameComparator = new Comparator<Employee3>() {
        @Override
        public int compare(Employee3 e1, Employee3 e2) {
            return e1.getName().compareTo(e2.getName());
        }
	 };

	public static void main(String[] args) {
		
		Employee3[] empArr = new Employee3[4];
		empArr[0] = new Employee3(339, "Shyam", 23, 25000);
		empArr[1] = new Employee3(333, "Vincent", 47, 35000);
		empArr[2] = new Employee3(336, "Khan", 19, 10000);
		empArr[3] = new Employee3(334, "Manoj", 66, 90000);
		
		Arrays.sort(empArr, C04_Comparator_Interface.SalaryComparator);
		System.out.println("Employee List sorted by Salary\n" + Arrays.toString(empArr));
		
		Arrays.sort(empArr, C04_Comparator_Interface.NameComparator);
		System.out.println("Employee List sorted by Name\n" + Arrays.toString(empArr));

	}	

}

class Employee3 { //No need to implement Comparable

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

    public Employee3(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
    
}


/*Comparator interface compare(Object o1, Object o2) method need to be implemented that takes two 
 * Object argument, it should be implemented in such a way that it returns negative int if the first
 * argument is less than the second one and returns zero if they are equal and positive int if the 
 * first argument is greater than the second one. Comparable and Comparator interfaces use Generics 
 * for compile-time type checking.
 * 
 * So now we know that if we want to sort java object array or list, we need to implement java 
 * Comparable interface to provide default sorting and we should implement java Comparator interface 
 * to provide different ways of sorting. 
 */
