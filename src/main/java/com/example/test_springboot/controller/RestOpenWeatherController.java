package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class RestOpenWeatherController {
    @RequestMapping(value = "/remote/openweather")

    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyId = "2aafa86e2c65228ad77dbb9ce9507ef7";
        String targetUri = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=" + keyId;
        resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}