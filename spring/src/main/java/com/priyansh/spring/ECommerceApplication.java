package com.priyansh.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.priyansh.spring.Repository.Author_repo;
import com.priyansh.spring.model.Author;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(Author_repo author_repo){
		return args -> {
			var author = Author.builder()
				.Firstname("animal")
				.lastname("animal")
				.email("animal@gmail.com")
				.age(20)
				.build();
			author_repo.save(author);
		};
	}

}
