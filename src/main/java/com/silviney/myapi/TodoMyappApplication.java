package com.silviney.myapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMyappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoMyappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

} 
