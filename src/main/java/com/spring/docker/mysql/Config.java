package com.spring.docker.mysql;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.spring.docker.mysql")
@Configuration
public class Config {
}
