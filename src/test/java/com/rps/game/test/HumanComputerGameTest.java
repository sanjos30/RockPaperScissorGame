package com.rps.game.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rps.game.Game;
import com.rps.game.HumanComputerGame;
import com.rps.game.moves.TestConstants;
import com.rps.game.players.PlayerType;


public class HumanComputerGameTest {

	@Test
	public void test_All() {
		
		Game game = new HumanComputerGame(PlayerType.COMPUTER, TestConstants.rock, TestConstants.paper);
		
		assertTrue(game.getPlayerOneMove().equals(TestConstants.rock));
		
		assertTrue(game.getPlayerTwoMove().equals(TestConstants.paper));
		
		
		assertTrue(game.getWinner().equals(PlayerType.COMPUTER));
	}
}
