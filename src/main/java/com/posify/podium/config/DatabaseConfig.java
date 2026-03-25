package com.posify.podium.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.posify.podium.respository.jpa")
@EnableMongoRepositories(basePackages = "com.posify.podium.respository.mongo")

public class DatabaseConfig {

}