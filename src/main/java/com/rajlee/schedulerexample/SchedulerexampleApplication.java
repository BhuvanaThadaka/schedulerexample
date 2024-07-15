package com.rajlee.schedulerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerexampleApplication.class, args);
	}

}
