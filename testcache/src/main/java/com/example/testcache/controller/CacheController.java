package com.example.testcache.controller;


import com.example.testcache.model.User;
import com.example.testcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
    @Autowired
    UserService userService;

    @GetMapping("testcache/{username}")
    public User testCache(@PathVariable("username") String username){
        return userService.getUserByUsername(username);
    }

    @GetMapping("updatecache/{username}")
    public User updateCache(@PathVariable("username") String username){
        User user = userService.getUserByUsername(username);
        user = userService.updateUser(user);
        return user;
    }
}
