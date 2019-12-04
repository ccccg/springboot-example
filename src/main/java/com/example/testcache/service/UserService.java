package com.example.testcache.service;

import com.example.testcache.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "emp")
@Service
public class UserService {
    User user;

    @Cacheable(cacheNames = {"user"})
    public static User getUserByUsername(String username){
        System.out.println("未启用缓存");
        User user = new User();
        user.setUsername(username);
        user.setPassword("xxxxx");
        return user;
    }
}
