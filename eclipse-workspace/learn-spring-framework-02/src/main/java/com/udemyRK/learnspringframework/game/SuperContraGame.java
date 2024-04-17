package com.udemyRK.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Primary – A bean should be given preference when multiple candidates are qualified
//@Qualifier – A Specific bean should be Auto-wired (name of the bean can also be used as qualifier without mentioning on the above of source method/field/bean)
//	@Qualifier has higher priority than @Primary


@Component
@Qualifier("SuperContraGameQualifier") //Without adding this also, 
//we can make this qualifier by calling 'Bean' name as @Qualifier("superContraGame")
//near to the Constructor/Method Arguments/parameters
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Sit Down");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Shoot a bullet");
	}
}
