package com.rps.game.score;

import com.rps.game.Game;
import com.rps.game.outcome.GameOutcome;
import com.rps.game.players.PlayerType;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static com.rps.game.constants.Constants.*;

public class ScoreManager {

    private static final int formatted_output_alignment = 35;
    public Map<Integer, Integer> humanScore = new HashMap<>();
    public Map<Integer, Integer> computerScore = new HashMap<>();

    public ScoreManager() {
        this.humanScore = new HashMap<>();
        this.computerScore = new HashMap<>();
        init();
    }

    static void printSeparator() {
        Stream.generate(() -> " _").limit(formatted_output_alignment).forEach(System.out::print);
        System.out.println();
    }

    public Map<Integer, Integer> getHumanScore() {
        return humanScore;
    }

    public void setHumanScore(Map<Integer, Integer> humanScore) {
        this.humanScore = humanScore;
    }

    public Map<Integer, Integer> getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(Map<Integer, Integer> computerScore) {
        this.computerScore = computerScore;
    }

    private void init() {
        // initialize scores as 0
        for (int i = 0; i <= 2; i++) {
            humanScore.put(i, 0);
            computerScore.put(i, 0);
        }
    }

    public void updateScore(GameOutcome humanPlayerGameOutcome) {
        // score is update always w.r.t human player which is also player 1
        int currentGameOutcomeCode = humanPlayerGameOutcome.getCode();

        switch (currentGameOutcomeCode) {
            case 0:
                humanScore.put(currentGameOutcomeCode, humanScore.getOrDefault(currentGameOutcomeCode, 0) + 1);
                // human win, computer losses
                computerScore.put(getOppositeGameOutcomeName(currentGameOutcomeCode), computerScore.getOrDefault(getOppositeGameOutcomeName(currentGameOutcomeCode), 0) + 1);
                break;
            case 1:
                humanScore.put(currentGameOutcomeCode, humanScore.getOrDefault(currentGameOutcomeCode, 0) + 1);

                // human losses, computer win
                computerScore.put(getOppositeGameOutcomeName(currentGameOutcomeCode), computerScore.getOrDefault(getOppositeGameOutcomeName(currentGameOutcomeCode), 0) + 1);
                break;
            case 2:
                humanScore.put(currentGameOutcomeCode, humanScore.getOrDefault(currentGameOutcomeCode, 0) + 1);
                computerScore.put(getOppositeGameOutcomeName(currentGameOutcomeCode), computerScore.getOrDefault(getOppositeGameOutcomeName(currentGameOutcomeCode), 0) + 1);
                break;
            default:
                // do nothing - handle invalid scoring out of scope but can be handled here.
                break;
        }
    }

    public PlayerType getWinner() {

        if (humanScore.get(0) > computerScore.get(0)) {
            return PlayerType.HUMAN;
        } else if (humanScore.get(0).equals(computerScore.get(0))) {
            return null;
        } else {
            return PlayerType.COMPUTER;
        }

    }

    public void displayTournamentScoreSummary() {
        printSeparator();
        System.out.format(ANSI_CYAN + "%40s\n", "TOURNAMENT SCORE SUMMARY" + ANSI_RESET);
        printSeparator();

        System.out.format(ANSI_GREEN + "%10s%10s\n", "WON: ", getWinner() == null ? "No Winner" : getWinner() + ANSI_RESET);

        printSeparator();
        System.out.println();
    }

    public void displayPlayersScore() {
        printSeparator();
        System.out.format(ANSI_CYAN + "%40s\n", "TOURNAMENT PLAYERS SCORE" + ANSI_RESET);
        printSeparator();

        System.out.format(ANSI_CYAN + FORMATTED_STRING_WITH_LINE_BREAK, "PLAYER", "WINS", "LOSE", "DRAW" + ANSI_RESET);

        System.out.format(ANSI_CYAN + FORMATTED_STRING_WITH_LINE_BREAK, PlayerType.HUMAN, humanScore.get(0), humanScore.getOrDefault(1, 0), humanScore.get(2) + ANSI_RESET);

        System.out.format(ANSI_CYAN + FORMATTED_STRING_WITH_LINE_BREAK, PlayerType.COMPUTER, computerScore.get(0), computerScore.getOrDefault(1, 0), computerScore.get(2) + ANSI_RESET);

        printSeparator();
        System.out.println();
    }

    public int getOppositeGameOutcomeName(int currentGameOutcomeCode) {
        if (currentGameOutcomeCode == ZERO) {
            return 1;
        } else if (currentGameOutcomeCode == ONE) {
            return 0;
        } else {
            return 2; // draw
        }
    }

    public void displayAllGamesScore(Game[] tournamentGames) {

        printSeparator();
        System.out.format(ANSI_BLUE + "%40s\n", "TOURNAMENT GAMES SCORE" + ANSI_RESET);
        printSeparator();
        System.out.format(ANSI_BLUE + FORMATTED_STRING_WITH_LINE_BREAK, "GAME", "WINNER", "HUMAN-MOVE", "COMPUTER-MOVE" + ANSI_RESET);

        for (int i = 0; i < tournamentGames.length; i++) {
            Game game = tournamentGames[i];
            System.out.format(ANSI_BLUE + FORMATTED_STRING_WITH_LINE_BREAK, i + 1, game.getWinner() == null ? "No Winner" : getWinner(), game.getPlayerOneMove(), game.getPlayerTwoMove() + ANSI_RESET);

        }
        printSeparator();
        System.out.println();
    }

}
