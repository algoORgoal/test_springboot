package com.example.test_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestWSController {
    @RequestMapping(value = "/ws/organization")
    public Object actionMethod() {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301212");
        resultObject.put("CELLPHONE", "001-3923-6940");
        return resultObject;
    }
}