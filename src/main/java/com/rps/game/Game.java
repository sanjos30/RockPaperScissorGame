package com.rps.game;

import com.rps.game.moves.GameItem;
import com.rps.game.players.PlayerType;

public interface Game {

    PlayerType getWinner();

    GameItem getPlayerOneMove();

    GameItem getPlayerTwoMove();

}
