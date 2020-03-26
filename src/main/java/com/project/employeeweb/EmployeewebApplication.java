package com.project.employeeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class EmployeewebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeewebApplication.class, args);
	}

}
