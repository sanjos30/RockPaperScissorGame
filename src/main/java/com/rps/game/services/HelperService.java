package com.rps.game.services;

import java.util.Random;

import com.rps.game.constants.Constants;
import com.rps.game.exception.RpsGameException;
import com.rps.game.moves.GameItem;
import com.rps.game.moves.Paper;
import com.rps.game.moves.Rock;
import com.rps.game.moves.Scissor;
import com.rps.game.outcome.GameOutcome;
import com.rps.game.players.PlayerType;

import static com.rps.game.constants.Constants.TWO;
import static com.rps.game.constants.Constants.ZERO;

public class HelperService {

	private static final Random random = new Random();

	public GameItem getGameItem(int handGestureCode) throws RpsGameException {

		switch ((int) (handGestureCode)) {
		default:
			throw new RpsGameException(Constants.RUNTIME_ERROR_MESSAGE_INVALID_HAND_GESTURE);
		case 0:
			return new Rock();
		case 1:
			return new Paper();
		case 2:
			return new Scissor();
		}

	}

	public GameItem getRandomGameItem() throws RpsGameException {

		int roboHandGestureCode = random.nextInt(3);
		return getGameItem(roboHandGestureCode);

	}

	/*
	 * Based on human score, get the winner
	 */
	public PlayerType getWinner(GameOutcome humanPlayerGameOutcome) {

		if (humanPlayerGameOutcome.getCode() == ZERO) {
			return  PlayerType.HUMAN;
		} else if (humanPlayerGameOutcome.getCode() == TWO) {
			return null;
		} else {
			return PlayerType.COMPUTER;
		}

	}
}
