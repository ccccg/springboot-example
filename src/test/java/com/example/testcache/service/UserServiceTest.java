package com.example.testcache.service;

import com.example.testcache.TestcacheApplicationTests;
import com.example.testcache.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest extends TestcacheApplicationTests {

    @Autowired
    UserService userService;
    User user;
    @BeforeEach
    void setUp() {
        System.out.println("---------测试执行前-----------");
        user = new User();
        user.setUsername("qqq");
        user.setPassword("xxxxx");
    }

    @After
    void tearDown() {
        System.out.println("---------测试执行后-----------");
    }

    @Test
    void getUserByUsername() {
        System.out.println(userService.getUserByUsername("ppp"));
        System.out.println(userService.getUserByUsername("ppp"));
    }

    @Test
    void updateUser(){

        userService.updateUser(this.user);
        System.out.println(userService.getUserByUsername("qqq"));
    }
}