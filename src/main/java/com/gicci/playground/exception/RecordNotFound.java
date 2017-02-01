package com.gicci.playground.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String RECORD_NOT_FOUND = "Record Not Found. ";
	
	public RecordNotFound() {
		super(RECORD_NOT_FOUND);
	}
	
	public RecordNotFound(String message) {
		super(RECORD_NOT_FOUND + message);
	}
	
	public RecordNotFound(Throwable cause) {
		super(cause);
	}
	
	public RecordNotFound(String message, Throwable cause) {
		super(RECORD_NOT_FOUND + message, cause);
	}
}
