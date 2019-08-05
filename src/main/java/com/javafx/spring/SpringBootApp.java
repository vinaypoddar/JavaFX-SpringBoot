package com.javafx.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class SpringBootApp {

	public static void main(String[] args) {

		Application.launch(JavaFxApplication.class, args);
	}

}
