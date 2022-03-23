package io.github.victorleitecosta10.learningopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LearningOpenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningOpenfeignApplication.class, args);
	}

}
