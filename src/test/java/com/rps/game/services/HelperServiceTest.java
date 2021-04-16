package com.rps.game.services;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rps.game.constants.Constants;
import com.rps.game.exception.RpsGameException;
import com.rps.game.outcome.GameOutcome;
import com.rps.game.players.PlayerType;

public class HelperServiceTest {

	HelperService helperService = new HelperService();

	@Test
	public void test_getGameItem() throws RpsGameException {
		int rockHandCode = 0;
		int paperHandCode = 1;
		int scissorHandCode = 2;
		
		assertTrue(helperService.getGameItem(rockHandCode).toString().equals("Rock"));
		
		assertTrue(helperService.getGameItem(paperHandCode).toString().equals("Paper"));

		assertTrue(helperService.getGameItem(scissorHandCode).toString().equals("Scissor"));


	}
	
	@Test
	public void test_getGameItem_Invalid()  {
		try {
			helperService.getGameItem(12);
		} catch (RpsGameException e) {
			assertTrue(e.getErrorMessage().equals(Constants.RUNTIME_ERROR_MESSAGE_INVALID_HAND_GESTURE)); // correct exception is caught.
		}
	
	}
	
	@Test
	public void test_getRandomItem() throws RpsGameException {
		assertTrue(helperService.getRandomGameItem().toString()!=null);
	}
	
	@Test
	public void test_getWinner() {
		
		assertTrue(helperService.getWinner(GameOutcome.WIN).equals(PlayerType.HUMAN));
	}

}
