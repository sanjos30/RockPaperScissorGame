package com.rps.game;

import com.rps.game.score.ScoreManager;

public class Tournament {

	transient int numberOfGames;

	Game[] tournamentGames;

	transient ScoreManager scoreManager;

	public Tournament(int numberOfGames) {
		this.numberOfGames = numberOfGames;
		this.scoreManager = new ScoreManager();
	}

	public Game[] getTournamentGames() {
		return tournamentGames;
	}

	public void setTournamentGames(Game[] tournamentGames) {
		this.tournamentGames = tournamentGames;
	}

	public int getNumberOfGames() {
		return numberOfGames;
	}

	public ScoreManager getScoreManager() {
		return scoreManager;
	}

}
