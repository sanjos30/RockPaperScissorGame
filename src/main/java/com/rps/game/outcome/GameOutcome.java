package com.rps.game.outcome;

import java.util.Objects;

public class GameOutcome {

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	private int code;
	private String name;

	private GameOutcome(int code, String nm) {
		this.code = code;
		name = nm;
	}

	public final static GameOutcome WIN = new GameOutcome(0, "WIN");
	public final static GameOutcome LOSE = new GameOutcome(1, "LOSE");
	public final static GameOutcome DRAW = new GameOutcome(2, "DRAW");

	@Override
	public boolean equals(Object o) {
		return (o instanceof GameOutcome) && (code == ((GameOutcome) o).code);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}
}
