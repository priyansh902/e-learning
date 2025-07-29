package com.priyansh.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.priyansh.spring.Repository.Author_repo;
import com.priyansh.spring.Repository.Video_Repo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
@EnableJpaAuditing
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

	@Configuration
 class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("E-Learning API")
                .version("1.0")
                .description("API documentation for E-Learning Application"));
    }
}

}
