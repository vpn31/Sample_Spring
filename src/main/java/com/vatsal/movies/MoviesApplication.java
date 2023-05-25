package com.vatsal.movies;	//Package declaration

import org.springframework.boot.SpringApplication;	//SpringApplication class which contains run method
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//Annotations
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	
	
}