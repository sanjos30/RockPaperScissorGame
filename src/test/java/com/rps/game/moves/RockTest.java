package com.rps.game.moves;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rps.game.outcome.GameOutcome;

public class RockTest {


	
	@Test
	public void testcompete_RockWithRock_Win() {
		assertTrue(TestConstants.rock.compete(TestConstants.rock).equals(GameOutcome.DRAW));
	}
	

	@Test
	public void testcompete_RockWithPaper_Draw() {
		assertTrue(TestConstants.rock.compete(TestConstants.paper).equals(GameOutcome.LOSE));
	}
	

	@Test
	public void testcompete_RockWithScissor_Lose() {
		assertTrue(TestConstants.rock.compete(TestConstants.scisosor).equals(GameOutcome.WIN));
	}
}
