package com.java.javareact.controller;

import com.java.javareact.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String home(){
        return "goto home";
    }

    @GetMapping("/test")
    public List<Map<String, Object>> test(){
        return testService.list();
    }
}
