package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);

		Programmer programmer = context.getBean(Programmer.class);
		programmer.code();

		Laptop laptop = context.getBean(Laptop.class);
		laptop.compile();
	}
}
