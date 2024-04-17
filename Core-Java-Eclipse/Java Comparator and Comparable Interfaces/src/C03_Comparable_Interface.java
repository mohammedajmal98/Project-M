import java.util.Arrays;

//Comparable - compareTo(T obj) 

public class C03_Comparable_Interface {

	public static void main(String[] args) {
		Employee2[] empArr = new Employee2[4];
		empArr[0] = new Employee2(339, "Shyam", 23, 25000);
		empArr[1] = new Employee2(333, "Vincent", 47, 35000);
		empArr[2] = new Employee2(336, "Khan", 19, 10000);
		empArr[3] = new Employee2(334, "Manoj", 66, 90000);
		
		Arrays.sort(empArr);
		System.out.println(Arrays.toString(empArr)); //It calls compareTo() automatically and print toString() method
	}

}

class Employee2 implements Comparable<Employee2> {

    private int id;
    private String name;
    private int age;
    private long salary;
    
    public Employee2(int id, String name, int age, int salary) {
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
    public int compareTo(Employee2 emp) {
        //let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
    	
//      return (this.id - emp.id); //To print in descending order, change (emp.id - this.id)
    	//return (this.age - emp.age);
    	return (int) (this.salary-emp.salary); //(or) return (int) (this.getSalary()-emp.getSalary());
    	
    	
    //For Ascending Order
    	//If it returns positive, it is 1
    	//If it returns negative, it is -1
    	//If equal, it is 0
    	//For Positive +1, move that element towards Right in the List
    	//For Negative -1, move that element towards Left in the List
    	//For equal =, stay that element at the same position in the list.
    	
//    	if(age==st.age)  
//    		return 0;  
//    	else if(age>st.age)  
//    		return 1;  
//    	else  
//    		return -1; 
        
    }

    @Override
    //this is required to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

}
/*As you can see that Employees array is sorted by id in ascending order. But, in most real-life 
 * scenarios, we want sorting based on different parameters. For example, as a CEO, I would like to 
 * sort the employees based on Salary, an HR would like to sort them based on age. This is the 
 * situation where we need to use Java Comparator interface because Comparable.compareTo(Object o) 
 * method implementation can provide default sorting and we can’t change it dynamically. Whereas with 
 * Comparator, we can define multiple methods with different ways of sorting and then chose the 
 * sorting method based on our requirements.
 */
