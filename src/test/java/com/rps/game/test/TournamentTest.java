package com.rps.game.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rps.game.Tournament;

public class TournamentTest {
	
	Tournament tournament = new Tournament(5);
	
	@Test
	public void test_TournamentAllMethods() {
		
		
		assertTrue(tournament.getNumberOfGames()==5);
		
		assertTrue(tournament.getScoreManager().getWinner()==null);
		
	}

}
