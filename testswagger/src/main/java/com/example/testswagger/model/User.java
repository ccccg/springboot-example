package com.example.testswagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ApiModel("用户类")
public class User implements Serializable {

    @ApiModelProperty("用户名")
    //@JsonProperty("user_name")
    String username;
    @ApiModelProperty("用户密码")
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
