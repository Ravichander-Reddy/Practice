package com.agri.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "{com.agri.repositories}")
public class AgriApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriApplication.class, args);
	}

}
