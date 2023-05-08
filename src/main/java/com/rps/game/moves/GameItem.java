package com.rps.game.moves;

import com.rps.game.outcome.GameOutcome;

public interface GameItem {

    GameOutcome compete(GameItem it);

    GameOutcome eval(Paper p);

    GameOutcome eval(Scissor s);

    GameOutcome eval(Rock r);

}
