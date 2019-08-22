package com.example.test_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestWSController04 {
    @RequestMapping(value = "/api/ajax", method = RequestMethod.POST)

    public Object actionMethod() {
        List<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("MEMBER_ID", "103029301201");
        data01.put("BYEOL_ID", "0000");
        data01.put("CHI_ID", "1111");
        data01.put("GWAN_ID", "2222");
        data01.put("JI_ID", "3333");
        resultObject.add(data01);
        return resultObject;
    }

}
