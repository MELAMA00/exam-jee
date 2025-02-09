package ma.xproce.TestExam;

import ma.xproce.TestExam.dao.entities.Video;
import ma.xproce.TestExam.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestExamApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestExamApplication.class, args);
	}

	@Bean
	CommandLineRunner start(VideoRepository videoRepository) {
		return args -> {

			// Populate the database with some initial videos
			videoRepository.save(new Video(null, "Introduction to Spring Boot", "https://example.com/spring-boot", "Learn the basics of Spring Boot."));
			videoRepository.save(new Video(null, "Advanced Java Programming", "https://example.com/advanced-java", "Master advanced Java concepts."));
			videoRepository.save(new Video(null, "Spring Data JPA Tutorial", "https://example.com/spring-data-jpa", "A comprehensive guide to Spring Data JPA."));
		};
	}
}
