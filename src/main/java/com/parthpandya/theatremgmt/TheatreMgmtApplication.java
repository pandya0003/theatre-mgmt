package com.parthpandya.theatremgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@PropertySource("classpath:application-h2.properties")
@ComponentScan(basePackages = "com.parthpandya.theatremgmt")
@SpringBootApplication
@EntityScan("com.parthpandya.theatremgmt.*")
@EnableJpaRepositories
public class TheatreMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheatreMgmtApplication.class, args);
	}

}
