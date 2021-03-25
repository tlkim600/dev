package com.boilerplate.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class DevApplication {

	public static void main(String[] args) {
		System.out.println("asdafsgs");
		SpringApplication.run(DevApplication.class, args);
	}

}
