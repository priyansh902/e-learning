package com.priyansh.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.priyansh.spring.Repository.Author_repo;
import com.priyansh.spring.Repository.Video_Repo;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(Author_repo author_repo, Video_Repo video_Repo){
		return args -> {
		/* 	var author = Author.builder()
				.Firstname("animal")
				.lastname("animal")
				.email("animal@gmail.com")
				.age(20)
				.build();
			author_repo.save(author);/* */ 

			// var video = Video.builder()
			// 	.name("abc")
			// 	.length(12)
			// 	.build();
			// video_Repo.save(video);
		};
	}

}
