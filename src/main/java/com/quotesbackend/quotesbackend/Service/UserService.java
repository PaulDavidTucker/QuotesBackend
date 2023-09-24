package com.quotesbackend.quotesbackend.Service;

import com.quotesbackend.quotesbackend.Database.LoadDatabase;
import com.quotesbackend.quotesbackend.Model.Users;
import com.quotesbackend.quotesbackend.Repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UsersRepository repository;
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    public void addUsertoDatabase(Users users){
        repository.save(users);
    }

}
