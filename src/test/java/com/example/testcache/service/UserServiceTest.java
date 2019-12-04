package com.example.testcache.service;

import com.example.testcache.TestcacheApplicationTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceTest extends TestcacheApplicationTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUserByUsername() {
        System.out.println(userService.getUserByUsername("zzz"));
        System.out.println(userService.getUserByUsername("zzz"));
    }
}