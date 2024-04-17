package com.udemyRK.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemyRK.learnspringframework.game.GameRunner;


//@Configuration - no need of these two annotations
//@ComponentScan	
public class XMLConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {
		//Check the context name for XML Configuration (src/main/resources)
		try(var context = new ClassPathXmlApplicationContext
				("contextConfiguration.xml")){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();
		
		}
	}

}
