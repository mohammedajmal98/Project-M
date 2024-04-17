package com.udemyRK.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemyRK.learnspringframework.game.GameRunner;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
									(GamingConfiguration.class)){
			
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
		//Using Type to retrieve bean
		//context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
		
		//It just prints whatever it is in toString(), can't call run() here
		//as above as it is only an instance of the particular bean
		System.out.println(context.getBean("gameRunner")); 
		}
	}

}
