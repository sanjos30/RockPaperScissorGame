package com.rps.game;

import com.rps.game.moves.GameItem;
import com.rps.game.players.PlayerType;

public class HumanComputerGame implements Game {

    transient PlayerType winner;
    transient GameItem humanMove;
    transient GameItem computerMove;

    public HumanComputerGame(PlayerType winner, GameItem humanMoveGameItem, GameItem computerMoveGameItem) {
        this.winner = winner;
        this.humanMove = humanMoveGameItem;
        this.computerMove = computerMoveGameItem;
    }

    @Override
    public PlayerType getWinner() {
        return winner;
    }

    /*
     * Player1 is human player in the context of HumanComputerPlayer
     */
    @Override
    public GameItem getPlayerOneMove() {
        return this.humanMove;
    }

    /*
     * Player2 is computer player in the context of HumanComputerPlayer
     */
    @Override
    public GameItem getPlayerTwoMove() {
        return this.computerMove;
    }

}
