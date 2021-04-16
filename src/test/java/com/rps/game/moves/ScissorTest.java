package com.rps.game.moves;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rps.game.outcome.GameOutcome;

public class ScissorTest {

	@Test
	public void testcompete_ScissorWithRock_Win() {
		assertTrue(TestConstants.scisosor.compete(TestConstants.rock).equals(GameOutcome.LOSE));
	}

	@Test
	public void testcompete_ScissorWithPaper_Draw() {
		assertTrue(TestConstants.scisosor.compete(TestConstants.paper).equals(GameOutcome.WIN));
	}

	@Test
	public void testcompete_ScissorkWithScissor_Lose() {
		assertTrue(TestConstants.scisosor.compete(TestConstants.scisosor).equals(GameOutcome.DRAW));
	}
}
