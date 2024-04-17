package com.udemyRK.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Let's create a class named 'BusinessClass' with 2 dependencies
//dependency 1 & dependency 2

@Component
class YourBusinessClass{
//Field Injection
	//Check the Output with and without Autowired
	//@Autowired	//Here 'Field Injection' happens
	Dependency1 dependency1;
	//@Autowired
	Dependency2 dependency2;
	


//Constructor Injection
	//@Autowired is not needed to mention explicitly for Constructor Injection
	@Autowired	//Here 'Constructor Injection' happens
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}	
	

//Setter Injection
	
//	@Autowired 	//Here 'Setter Injection' happens
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection 1");
//		this.dependency1 = dependency1;
//	}
//	@Autowired 
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection 2");
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan	//It automatically scans the current package with its subpackages
public class DependencyInjectionTypesLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
						(DependencyInjectionTypesLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		
		}
	}

}
