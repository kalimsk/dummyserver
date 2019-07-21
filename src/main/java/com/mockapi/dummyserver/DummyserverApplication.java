package com.mockapi.dummyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${data.path}/mapping.properties")
public class DummyserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyserverApplication.class, args);
	}

}
