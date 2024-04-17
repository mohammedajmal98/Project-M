package e05Inheritance;

//Inheritance - Is A Relationship (Manager is an Employee)
//	private - variables/methods can only be used within a class.
//	protected - variables/methods can also be used in Child class
//	final - class can't be inherited, variable can't be changed, method can't be overridden in derived class

//	Class based + Variable/Methods/Constructors  -> 
//		Public & Default (Access Modifiers), Final & Abstract (Non access modifiers)

class Employee {
	private String name;
	private double salary;
	
	Employee(String n, double s){
		name = n;
		salary = s;
	}
	
//	Employee(){		//If we don't create this default constructor, it'll raise error in child class constructors
//		
//	}				//No need for this constructor, because child class constructor use "super" to mention base 
	//class constructor. If it fails to do, super() is implicitly called and raise an error.

	String getName() {return name;}
	void setName(String n) {name = n;}
	double getSalary() {return salary;}
	void setSalary(double s) {salary = s; }
	
	void raiseSalary(double percent){
		salary += salary*percent/100;
	}
}

class Manager extends Employee {
	double bonus;
	
	Manager(String n, double s, double b){
//		name = n;
//		salary = s;   
		//It is not possible because variables are in "Private". Can use "Protected" variable/methods in child class
		super(n,s);	  //So, we use "Super" to use the base class constructor	
		bonus = b; 
	}
	
	void setBonus(double b) {
		bonus = b;
	}
	
	double getSalary(){					//Method Overriding
		return super.getSalary()+bonus;		//to avoid calling the same method in child class, we use 'super'
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ram", 50000);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());
		
		Manager m1 = new Manager("John",80000,0.0);
		m1.setBonus(20000);		//If we use "Employee" reference in creating "Manager" object, 
		//we can't call setBonus() as method with same name is not present in the base class.
		System.out.println(m1.getSalary());
		
		//Objects in array
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("Ram", 50000);
		employees[1] = new Employee("Kavin", 60000);
		employees[2] = new Employee("Vikram", 70000);
		employees[3] = m1;  //Dynamic Binding: Reference correctly picks the method in the runtime.
		//Eg: For first 3 employees, getSalary() in base class is called. For 4th employee, getSalary() in 
		//child class is called/invoked as it is overridden by child class(includes bonus in the salary)
		employees[3].setSalary(100000);
		
		
		//Polymorphic behaviour : Object can be stored in both base class reference and child class reference
		
		employees[4] = new Manager("Alan",100000,0.0); //can't call setBonus() using this Employee reference
		Manager m2 = (Manager) employees[4];		//so, we use casting
		m2.setBonus(50000);
		
		//Manager m3 = (Manager) employees[1]; //It is not possible. It shows no compilation error. But It'll give 
		//runtime error
		
		if(employees[1] instanceof Manager) { //to check whether it is an instance of 'Manager' class to avoid 
			//runtime error. It is safe to use before any "casting" operations
			Manager m3 = (Manager) employees[1];
		}
		
		
		for(Employee e : employees){
			System.out.println(e.getName() + " " + e.getSalary());
		}
		
	}
}
