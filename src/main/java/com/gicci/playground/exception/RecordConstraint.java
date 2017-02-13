package com.gicci.playground.exception;

public class RecordConstraint extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public RecordConstraint(String message) {
		super(message);
	}
}
