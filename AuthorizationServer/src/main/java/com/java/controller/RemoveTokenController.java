package com.java.controller;

import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RemoveTokenController {

    @Resource
    private ConsumerTokenServices consumerTokenServices;


    @PostMapping("/removeToken/{access_token}")
    public Boolean removeToken(@PathVariable String access_token){
        return consumerTokenServices.revokeToken(access_token);
    }

}
