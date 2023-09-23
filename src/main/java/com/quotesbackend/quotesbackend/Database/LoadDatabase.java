package com.quotesbackend.quotesbackend.Database;

import com.quotesbackend.quotesbackend.Model.Users;
import com.quotesbackend.quotesbackend.Repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(UsersRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Users("Tuckp04" , "Password", "Test@Test.com", 0)));
            log.info("Preloading " + repository.save(new Users("Frodo Baggins", "Password", "Test2@Test.com", 0)));
        };
    }
}
