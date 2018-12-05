package com.example.demo.controller;


import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topic",method = RequestMethod.GET)
    public String getTopicAll(Model model){
        List<Topic> topics=topicService.selectAll();
        System.out.print(topics.get(0).getId());
        model.addAttribute("str",topics.get(0).getId());
        model.addAttribute("topics",topics);
        return "model";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listUser(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list

        String str = "Hello！";
        model.addAttribute("str",str);
        return "list";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }




}
