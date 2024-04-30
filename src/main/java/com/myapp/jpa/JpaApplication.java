package com.myapp.jpa;

import com.myapp.jpa.models.Author;
import com.myapp.jpa.models.Video;
import com.myapp.jpa.repositories.AuthorRepository;
import com.myapp.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
					AuthorRepository repository,
					VideoRepository videoRepository
			){
		return args -> {
			var author = Author.builder()
					.firstName("Ahmed")
					.lastName("Abdelkawy")
					.age(24)
					.email("ahmedadel@mail.com")
					.build();
			repository.save(author);
			/*
			var video = Video.builder()
					.name("Java Tutorials")
					.length(5)
					.build();
			videoRepository.save(video); 
			 */
		};
	}
}
