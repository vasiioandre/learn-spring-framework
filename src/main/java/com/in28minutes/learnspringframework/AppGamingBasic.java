package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
