package com.gicci.playground.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gicci.playground.*"})
public class PlayGroundApp {

	public static void main(String[] args) {
		SpringApplication.run(PlayGroundApp.class, args);
	}
}
