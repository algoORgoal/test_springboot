package com.example.test_springboot.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestAjaxController {
    @RequestMapping(value = "/api/ajaxll", method = RequestMethod.POST)
    public String getParmWithAjax() {
        return "Welcome to Hellow World !! ";
    }
}
=======
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
>>>>>>> 9def0392209c5b4cdeb88b7f6d81ebbba77e1612
