package com.example.testcache.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class User implements Serializable {

    //@JsonProperty("user_name")
    String username;
    //@JsonProperty("pass_word")
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return username+" "+password;
    }

}
