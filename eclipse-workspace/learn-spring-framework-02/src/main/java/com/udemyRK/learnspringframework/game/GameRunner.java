package com.udemyRK.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	//MarioGame game;	//GameRunner class tightly coupled to a specific game
	
	//private SuperContraGame game;
	
	private GamingConsole game;
	
	//Here, Autowiring is happening through 'Constructor Injection'
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
