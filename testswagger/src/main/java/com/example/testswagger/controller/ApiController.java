package com.example.testswagger.controller;

import com.example.testswagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> origin/master
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class ApiController {

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    @PostMapping("/add")
    @ApiOperation("添加用户")
    public User addUser(@RequestBody User user) {
        if(user.getUsername().equals("ppp")){
            LOGGER.error("用户名错误");
            return null;
        }else {
            LOGGER.info("传入一个user对象");
            return user;
        }
    }
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }

}
