package com.example.test_springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestAjaxController {
    @RequestMapping(value = "/api/ajax02", method = RequestMethod.POST)

    public Object getParmWithAjax(@RequestParam Map<String, Object> paramMap) {
        Map<String, Object> total = paramMap;
        // String str = (String) paramMap.get("title");
        return paramMap;
    }
}