package com.microservices.entrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class EntrypointApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrypointApplication.class, args);
	}

}
