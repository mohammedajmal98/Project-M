package com.udemyRK.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan - tell Spring in which package to search for specific @Component class

@Configuration
@ComponentScan("com.udemyRK.learnspringframework.game")
public class GamingAppLauncherApplication {
	
	//To make Spring even create the below one for us
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		//Instance of PacMan Game is created and 
//		//Autowired here by Spring by @Component using @ComponentScan
//		System.out.println("Parameter: " + game); 
//		var gameRunner = new GameRunner(game); //pass as Parameter/Method call
//		return gameRunner;
//	}
	
/*After adding @Component in PacMan Game, add @Component even in GameRunner Class
As both are in same packages, no need to worry about @Component Scan
*/	

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
									(GamingAppLauncherApplication.class)){
		
		//Using Type to retrieve bean
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
		
		}
	}

}
