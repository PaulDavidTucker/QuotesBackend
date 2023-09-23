package com.quotesbackend.quotesbackend.Controller;

import com.quotesbackend.quotesbackend.Database.LoadDatabase;
import com.quotesbackend.quotesbackend.Exception.UserNotFoundException;
import com.quotesbackend.quotesbackend.Model.Users;
import com.quotesbackend.quotesbackend.Repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    private final UsersRepository repository;

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    UsersController(UsersRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/users")
    List<Users> all() {
        log.info("Retrieved all users");
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/users")
    Users newUsers(@RequestBody Users newUsers) {
        log.info("Retrieved ");
        return repository.save(newUsers);
    }

    // Single item

    @GetMapping("/users/{id}")
    Users one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/users/{id}")
    Users replaceUsers(@RequestBody Users newUsers, @PathVariable Integer id) {

        return repository.findById(id)
                .map(user -> {
                    user.setUsername(newUsers.getUsername());
                    user.setPassword(newUsers.getPassword());
                    user.setEmail(newUsers.getEmail());
                    user.setKarma(newUsers.getKarma());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUsers.setUser_ID(id);
                    return repository.save(newUsers);
                });
    }

    @DeleteMapping("/users/{id}")
    void deleteUsers(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}

