package com.example.demo.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public class HelloController {
    @RequestMapping("/helloworld")
    public String hello(){
        return "hello";
    }
}
