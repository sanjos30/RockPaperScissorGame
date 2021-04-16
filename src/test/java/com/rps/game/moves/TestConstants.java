package com.rps.game.moves;

import java.util.HashMap;
import java.util.Map;

import com.rps.game.Game;

public class TestConstants {

	public static final GameItem paper = new Paper();

	public static final GameItem rock = new Rock();

	public static final GameItem scisosor = new Scissor();

	public static Map<Integer, Integer> getMockScore(int numberOfWins, int numberOfLoss, int numberOfDraw) {

		Map<Integer, Integer> mockPlayerScore = new HashMap<Integer, Integer>();
		mockPlayerScore.put(0, numberOfWins);
		mockPlayerScore.put(1, numberOfLoss);
		mockPlayerScore.put(2, numberOfDraw);
		return mockPlayerScore;
	}
	
	public static Game[] getMockGames(int count) {
		
		return null;
	}

}
