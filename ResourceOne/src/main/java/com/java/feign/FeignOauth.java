package com.java.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name="FeignOauth", url="localhost:8080")
public interface FeignOauth {

    @PostMapping(path = "/oauth/token")
    Map<String, Object> accessToken(@RequestParam Map<String, String> parameters);

    @PostMapping("/removeToken/{access_token}")
    Boolean removeToken(@PathVariable String access_token);


}
