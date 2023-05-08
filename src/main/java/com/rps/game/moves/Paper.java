package com.rps.game.moves;

import com.rps.game.outcome.GameOutcome;

public class Paper implements GameItem {

    public GameOutcome compete(GameItem it) {
        return it.eval(this);
    }

    public GameOutcome eval(Paper p) {
        return GameOutcome.DRAW;
    }

    public GameOutcome eval(Scissor s) {
        return GameOutcome.WIN;
    }

    public GameOutcome eval(Rock r) {
        return GameOutcome.LOSE;
    }
    
    public String toString() {
        return "Paper";
    }

}
