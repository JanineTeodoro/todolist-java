package br.com.janineteodoro.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	//Rodando a aplicação por comando:
	//mvn spring-boot:run
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
