package com.example.test_springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    public Object actionMethod() {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("BYEOL_ID", "0000");
        resultObject.put("CHI_ID", "1111");
        resultObject.put("GWAN_ID", "2222");
        resultObject.put("JI_ID", "3333");
        return resultObject;
    }
}