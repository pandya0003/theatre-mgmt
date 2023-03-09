package com.parthpandya.theatremgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-h2.properties")
public class TheatreMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheatreMgmtApplication.class, args);
	}

}
