package com.quotesbackend.quotesbackend.UserFunctionalityTests;

import com.quotesbackend.quotesbackend.Model.Users;
import com.quotesbackend.quotesbackend.Service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {

    private Users testUser = new Users("Test Profile Username", "Password", "Email@com.com", 3);

    private UserService userService;

    @BeforeAll
    public static void setup(){
    }

    @Test
    public void setValuesCorrectlyUpdates(){
        String originalEmail = testUser.getEmail();

        testUser.setEmail("test@testtest");

        assertNotEquals(originalEmail, testUser.getEmail());
    }
}
