package com.app.main;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.entity.Actor;
import com.app.entity.Spectacle;
import com.app.repository.ActorRepository;
import com.app.repository.SpectacleRepository;

@SpringBootApplication
@ComponentScan({ "com.app" })
@EntityScan("com.app.entity")
@EnableJpaRepositories("com.app.repository")
public class Application implements CommandLineRunner {
         //uzywamy logów zamiast systemprintout
	private Logger logger = LoggerFactory.getLogger(this.getClass()); //inicjalizacja loggera

	// @Autowired
	// PersonSpringDataRepository repository;

	@Autowired
	ActorRepository repository;

	@Autowired
	SpectacleRepository spectacleRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting -> {}", repository.save(new Actor("Marcin", "Nieznalski", 10))); //uzycie loggera //priorytet info w celu sledzenia wykonania

		double price = 0;
		for (Actor actor : repository.findAll()) {
			price += actor.getSalary();
		}

		// logger.info("Inserting -> {}",
		// spectacleRepository.save(new Spectacle(1, new Date(), "Spektakl 1", 10.20,
		// price)));
		logger.info("Inserting -> {}",
				spectacleRepository.save(new Spectacle(2, new Date(), "Spektakl 1", 120.20, price)));
		logger.info("Inserting -> {}",
				spectacleRepository.save(new Spectacle(3, new Date(), "Spektakl 2", 90.20, price)));
		logger.info("Inserting -> {}",
				spectacleRepository.save(new Spectacle(4, new Date(), "Spektakl 3", 290.20, price)));
		logger.info("All users -> {}", repository.findAll());

	}
}
