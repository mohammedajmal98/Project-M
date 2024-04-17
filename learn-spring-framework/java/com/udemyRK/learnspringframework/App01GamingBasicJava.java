package com.udemyRK.learnspringframework;

import com.udemyRK.learnspringframework.game.GameRunner;
import com.udemyRK.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//MarioGame marioGame = new MarioGame();	//'var' infers MarioGame
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();	//1) Object Creation
		
		var gameRunner = new GameRunner(game);	//'var' infers GameRunner	
		// 1)Object Creation + Wiring of Dependencies (injected/wired)  
		//Here, 'game' is a dependency of GameRunner class
		
		gameRunner.run();
		
		System.out.println(gameRunner);
	}

}
