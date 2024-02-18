package com.example.datastudy.employeedb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeedbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedbApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository employeeRepository)
	{
		return (args -> {
			insert(employeeRepository);
		    System.out.println(employeeRepository.findAll());
		});
	}

	private void insert(EmployeeRepository employeeRepository)
	{
		employeeRepository.save(new Employee("John","Christopher"));
		employeeRepository.save(new Employee("Adam","Jones"));
		employeeRepository.save(new Employee("Will","Robinson"));
		employeeRepository.save(new Employee("Matelda","Angel"));
	}

}
