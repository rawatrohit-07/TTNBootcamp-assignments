package com.rohit.Question3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Question3Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Question3Application.class, args);
		Restaurant restaurant = context.getBean(Restaurant.class);
		restaurant.serveTea();
	}
}
