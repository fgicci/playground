package com.gicci.playground.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan({
	"com.gicci.playground.model"
})
@EnableJpaRepositories({
	"com.gicci.playground.repository"
})
@ComponentScan({
	"com.gicci.playground"
})
public class PlayGroundApp {

	public static void main(String[] args) {
		SpringApplication.run(PlayGroundApp.class, args);
	}
}
