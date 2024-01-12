package com.pluralsight.fundamental;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pluralsight.fundamental.entity.Application;
import com.pluralsight.fundamental.respository.ApplicationRepository;

@SpringBootApplication
public class FundamentalApplication {
	private static final Logger log = LoggerFactory.getLogger(FundamentalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FundamentalApplication.class, args);
		System.out.println("Hello Plural Sight");
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla", "kensha.williams", "Application for tracking bugs."));
			repository.save(new Application("Expenses", "mary.jones", "Application to track expense reports."));
			repository.save(
					new Application("Notifications", "karen.kane", "Application to send alerts and notifications."));
			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}

}
