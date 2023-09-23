package com.quotesbackend.quotesbackend.Exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Integer id){
        super("Could not find the requested User for ID " + id);
    }
}
