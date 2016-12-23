package com.gicci.playground.model;

public enum Sport {

	BASKETBALL ("BasketBall"),
	FOOTBALL ("FootBall"),
	HANDBALL ("HandBall"),
	RUNNING ("Running"),
	VOLLEYBALL ("VolleyBall");
	
	private String description;
	
	Sport(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
