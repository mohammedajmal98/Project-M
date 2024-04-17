package com.udemyRK.learnspringframework.game;

public class GameRunner {
	//MarioGame game;	//GameRunner class tightly coupled to a specific game
	
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}
	
	//private SuperContraGame game;
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	@Override
	public String toString() {
		return "Nothing....";
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
