package com.gicci.playground.exception;

public class RecordConstraint extends Exception {

	private static final long serialVersionUID = 1L;
	public static String ERROR = "ERROR";
	public static String WARNING = "WARNING";
	
	private String status;
	
	public RecordConstraint(String status, String message) {
		super(message);
		this.status = status;
	}
	
	public String getMessage() {
		return this.status + " - " + this.getMessage();
	}
}
