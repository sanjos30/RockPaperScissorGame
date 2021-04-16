package com.rps.game.exception;


public class RpsGameException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	
	public RpsGameException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	
}
