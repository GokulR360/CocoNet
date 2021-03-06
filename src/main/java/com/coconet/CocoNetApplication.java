package com.coconet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;


@SpringBootApplication
/*@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.coconet"})*/
public class CocoNetApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CocoNetApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CocoNetApplication.class, args);
	}
}
