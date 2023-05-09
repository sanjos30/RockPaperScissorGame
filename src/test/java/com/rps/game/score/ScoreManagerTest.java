package com.rps.game.score;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import com.rps.game.Game;
import com.rps.game.HumanComputerGame;
import com.rps.game.score.ScoreManager;
import org.junit.Test;

import com.rps.game.Tournament;
import com.rps.game.moves.TestConstants;
import com.rps.game.outcome.GameOutcome;
import com.rps.game.players.PlayerType;

public class ScoreManagerTest {

	public Map<Integer, Integer> humanScore = new HashMap<>();
	public Map<Integer, Integer> computerScore = new HashMap<>();

	ScoreManager scoreManager = new ScoreManager();
	
	private static final ByteArrayOutputStream testBufferOutput = new ByteArrayOutputStream();


	@Test
	public void test_updateScore() {

		GameOutcome humanPlayerGameOutcome = GameOutcome.WIN;
		
		scoreManager.setHumanScore(TestConstants.getMockScore(5, 3, 2)); 
		scoreManager.setComputerScore(TestConstants.getMockScore(3, 5, 2)); 
		
		// this should increment human score win and decrement computer lose
		scoreManager.updateScore(humanPlayerGameOutcome);
		
		assertTrue(scoreManager.getHumanScore().get(0) == 6);
		assertTrue(scoreManager.getComputerScore().get(1) == 6);
		
		
		scoreManager.updateScore(GameOutcome.DRAW);
		assertTrue(scoreManager.getHumanScore().get(2) == 3);
		assertTrue(scoreManager.getComputerScore().get(2) == 3);


		scoreManager.updateScore(GameOutcome.LOSE);
		assertTrue(scoreManager.getHumanScore().get(1) == 4);
		assertTrue(scoreManager.getComputerScore().get(0) == 4);

	}

	@Test
	public void test_getWinner() {

		scoreManager.humanScore = TestConstants.getMockScore(5, 3, 2);
		scoreManager.computerScore = TestConstants.getMockScore(3, 5, 2);
		assertTrue(scoreManager.getWinner().equals(PlayerType.HUMAN));
		
		
		scoreManager.computerScore = TestConstants.getMockScore(6, 5, 2);

		assertTrue(scoreManager.getWinner().equals(PlayerType.COMPUTER));

		
		scoreManager.computerScore = TestConstants.getMockScore(5, 3, 2);

		assertTrue(scoreManager.getWinner()==null);

	}

	@Test
	public void test_getOppositeGameOutcome() {
		assertTrue(scoreManager.getOppositeGameOutcomeName(0) == 1);

		assertTrue(scoreManager.getOppositeGameOutcomeName(1) == 0);

		assertTrue(scoreManager.getOppositeGameOutcomeName(2) == 2);
	}

	
	@Test
	public void test_displayPlayerScore() {
		System.setOut(new PrintStream(testBufferOutput));

		scoreManager.displayPlayersScore();
		
		// get the output
		final String standardOutput = testBufferOutput.toString();
		System.out.println(standardOutput);
		// verify the output has computed areas
		assertTrue(standardOutput.contains("TOURNAMENT PLAYERS SCORE"));

	}
	
	
	@Test
	public void test_displayTournamentScoreSummary() {
		System.setOut(new PrintStream(testBufferOutput));
		scoreManager.displayTournamentScoreSummary();
		final String standardOutput = testBufferOutput.toString();
		// verify the output has the heading
		assertTrue(standardOutput.contains("TOURNAMENT SCORE SUMMARY"));

	}

	@Test
	public void test_displayAllGamesScore(){
		Game game = new HumanComputerGame(PlayerType.COMPUTER, TestConstants.rock, TestConstants.paper);
		System.setOut(new PrintStream(testBufferOutput));
		Game[] tournamentGames = new Game[]{game};
		scoreManager.displayAllGamesScore(tournamentGames);
		final String standardOutput = testBufferOutput.toString();
		System.out.println(standardOutput);
		//assertTrue(standardOutput.contains("TOURNAMENT SCORE SUMMARY"));
	}
}
