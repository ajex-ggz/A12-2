package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TurnController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "login";
    }
    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    public String signup(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "signup";
    }
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "about";
    }
    @RequestMapping(value = "/services",method = RequestMethod.GET)
    public String services(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "services";
    }
    @RequestMapping(value = "/portfolio",method = RequestMethod.GET)
    public String portfolio(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "portfolio";
    }
    @RequestMapping(value = "/team",method = RequestMethod.GET)
    public String team(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "team";
    }
    @RequestMapping(value = "/blog",method = RequestMethod.GET)
    public String blog(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "blog";
    }
    @RequestMapping(value = "/contact",method = RequestMethod.GET)
    public String contact(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        return "contact";
    }
}
