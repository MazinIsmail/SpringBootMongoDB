package com.mongodb.learnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mongodb.learnings*")
public class MongoDBLearningsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MongoDBLearningsApplication.class, args);
	}
}
