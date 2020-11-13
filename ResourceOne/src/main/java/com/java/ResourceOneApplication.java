package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ResourceOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceOneApplication.class,args);
    }
}
