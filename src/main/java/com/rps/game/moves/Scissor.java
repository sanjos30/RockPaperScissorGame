package com.rps.game.moves;

import com.rps.game.outcome.GameOutcome;

public class Scissor implements GameItem {

	public GameOutcome compete(GameItem it) {
		return it.eval(this);
	}

	public GameOutcome eval(Paper p) {
		return GameOutcome.LOSE;
	}

	public GameOutcome eval(Scissor s) {
		return GameOutcome.DRAW;
	}

	public GameOutcome eval(Rock r) {
		return GameOutcome.WIN;
	}

	public String toString() {
		return "Scissor";
	}

}
