package com.udemyRK.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //Because of 'Eager' initialization, ClassA bean is initialized 
//when the application starting up
class ClassA{
	public ClassA() {
		System.out.println("fromClassA");
	}
	
}

@Component
@Lazy		//Check output with and without Lazy
//with @Lazy - ClassB bean is not initialized until it is used specifically
class ClassB{
	ClassA classA;
	public ClassB(ClassA classA) {
		//Logic
		//Eventhough we're not loading/calling any bean/method, the beans are 
		//automatically initialized i.e., Eager (default)
		//To prevent that, we use @Lazy
		System.out.println("Some Initialization Logic");
		this.classA = classA;
	}
}

@Configuration
@ComponentScan	//It automatically scans the current package with its subpackages
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
						(LazyInitializationLauncherApplication.class)){
			//Now itself ClassA bean is initialized but not ClassB bcoz of @Lazy
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class); 
			//Now only Spring context initializes beans for ClassB (only 
			//when it is used otherwise it'll be lazy)
			
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
//		
		}
	}

}
