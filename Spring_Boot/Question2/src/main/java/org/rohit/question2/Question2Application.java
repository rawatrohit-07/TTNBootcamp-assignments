package org.rohit.question2;

import org.rohit.question2.Config.CurrencyServiceProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Question2Application {

    public static void main(String[] args) {
        SpringApplication.run(Question2Application.class, args);
    }

    @Bean
    CommandLineRunner readProperties(CurrencyServiceProperties props) {
        return args -> {
            System.out.println("URL = " + props.getUrl());
            System.out.println("Username = " + props.getUsername());
            System.out.println("Key = " + props.getKey());
        };

    }
}