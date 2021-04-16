package com.rps.game.moves;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rps.game.outcome.GameOutcome;

public class PaperTest {


	
	@Test
	public void testcompete_PaperWithRock_Win() {
		assertTrue(TestConstants.paper.compete(TestConstants.rock).equals(GameOutcome.WIN));
	}
	

	@Test
	public void testcompete_PaperWithPaper_Draw() {
		assertTrue(TestConstants.paper.compete(TestConstants.paper).equals(GameOutcome.DRAW));
	}
	

	@Test
	public void testcompete_PaperWithScissor_Lose() {
		assertTrue(TestConstants.paper.compete(TestConstants.scisosor).equals(GameOutcome.LOSE));
	}
}
