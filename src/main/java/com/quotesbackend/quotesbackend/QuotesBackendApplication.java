package com.quotesbackend.quotesbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class QuotesBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuotesBackendApplication.class, args);
    }

}
