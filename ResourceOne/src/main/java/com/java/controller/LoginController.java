package com.java.controller;

import com.java.feign.FeignOauth;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Resource
    private FeignOauth feignOauth;

    @PostMapping("/getOauth")
    public Map<String, Object> login(String username, String password) {

        Map<String, String> parameters = new HashMap<>(6);
        parameters.put("grant_type", "password");
        parameters.put("client_id", "client");
        parameters.put("client_secret", "123456");
        parameters.put("scope", "all");
        parameters.put("username", username);
        parameters.put("password", password);
        return feignOauth.accessToken(parameters);
    }

    @PostMapping("/removeToken")
    public Boolean removeToken(String access_token){
        return feignOauth.removeToken(access_token);
    }


    /*用来测试token是否remove了*/
    @GetMapping("/hello")
    public String hello(String name){
        return name;
    }


}
