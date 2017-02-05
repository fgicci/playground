package com.gicci.playground.exception;

public class RecordNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public RecordNotFound(String message) {
		super(message);
	}
}
