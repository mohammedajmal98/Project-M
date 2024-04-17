package com.udemyRK.learnspringframework.game;

import org.springframework.stereotype.Component;

//@Component makes Spring to manage this class (no need to create Beans/Objects/Instances)
@Component 
public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("down");
	}
	
	public void left() {
		System.out.println("left");
	}
	
	public void right() {
		System.out.println("right");
	}
}
