package com.rps.game.moves;

import com.rps.game.outcome.GameOutcome;

public class Rock implements GameItem{

	public GameOutcome compete(GameItem it) {
		return it.eval(this);
	}

	public GameOutcome eval(Paper p) {
		return GameOutcome.WIN;
	}

	public GameOutcome eval(Scissor s) {
		return GameOutcome.LOSE;
	}

	public GameOutcome eval(Rock r) {
		return GameOutcome.DRAW;
	}

	public String toString() {
		return "Rock";
	}

	
}
