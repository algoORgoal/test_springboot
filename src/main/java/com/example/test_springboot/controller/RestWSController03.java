package com.example.test_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestWSController03 {
    @RequestMapping(value = "/ws/organizationList")
    public Object actionMethod() {
        List<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        Map<String, Object> data02 = new HashMap<String, Object>();
        Map<String, Object> data03 = new HashMap<String, Object>();
        data01.put("MEMBER_ID", "1111");
        data01.put("NAME", "1111");
        data01.put("PASSWORD", "1111");
        data01.put("HOBBY", "1111");
        data01.put("AGE", "1111");
        resultObject.add(data01);

        data02.put("MEMBER_ID", "2222");
        data02.put("NAME", "2222");
        data02.put("PASSWORD", "2222");
        data02.put("HOBBY", "2222");
        data02.put("AGE", "2222");
        resultObject.add(data02);

        data03.put("MEMBER_ID", "3333");
        data03.put("NAME", "3333");
        data03.put("PASSWORD", "3333");
        data03.put("HOBBY", "3333");
        data03.put("AGE", "3333");
        resultObject.add(data03);

        return resultObject;
    }

}
