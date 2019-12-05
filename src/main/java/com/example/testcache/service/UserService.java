package com.example.testcache.service;

import com.example.testcache.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

//@CacheConfig(cacheNames = "user")
@Service
public class UserService {
    User user;

    @Cacheable(cacheNames = "user", key = "#username")
    public User getUserByUsername(String username){
        System.out.println("未启用缓存");
        User user = new User();
        user.setUsername(username);
        user.setPassword("xxxxx");
        return user;
    }

    @CachePut(cacheNames = "user", key = "#user.username")
    public User updateUser(User user){

        System.out.println("更新缓存");
        user.setPassword("xaaaa");
        return user;
    }


}
