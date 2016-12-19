package com.gicci.playground.exception;

public class RecordNotFound extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RecordNotFound(String message) {
		super(message);
	}
	
	public String getMessage() {
		return RecordConstraint.ERROR + " - " + this.getMessage();
	}
	
}
