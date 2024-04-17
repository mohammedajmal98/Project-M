package com.udemyRK.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/* @PostConstruct - If we want to execute some initialization logic as 
 * soon as the dependencies are wired in, use this (eg: Fetch some data 
 * from the database)
 * 
 * @PreDestroy - If we want to do a cleanup before a bean is removed 
 * from the container/ApplicationContext. 
 */

@Component
class SomeClass{
	SomeDependency someDependency;
	
	public SomeClass (SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}
	
	//Once all dependencies of beans are ready to set, it runs the below method
	@PostConstruct 
	public void initialize() {
		someDependency.getReady();
		System.out.println("Haha, PostConstruct done!!!!");
	}
	
	@PostConstruct 
	public void intialize() {
		someDependency.getReady();
		System.out.println("Haa, PostConstruct done!!!!");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleanup check by @PreDestroy");
	}
}

@Component
class SomeDependency{

	public void getReady() {
		System.out.println("Checking for PostConstruct - code");
	}
	
}


@Configuration
@ComponentScan	
public class PrePostAnnotationsContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
						(PrePostAnnotationsContextLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println("Happy");
		
		}
	}

}
