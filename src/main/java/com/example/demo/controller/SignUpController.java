package com.example.demo.controller;

import com.example.demo.model.Usera12;
import com.example.demo.service.UserA12Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
@RequestMapping("/")
public class SignUpController {

    @Autowired
    private UserA12Service userA12Service;

    @RequestMapping(value = "/signupAction",method = RequestMethod.POST)
    public ModelAndView signupAction(@ModelAttribute Usera12 usera12){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(usera12.getPhone());
        int result = userA12Service.insert(usera12);
        System.out.println();
        if(result == 0){
            modelAndView.addObject("error","账号或密码错误！");
            modelAndView.setViewName("login");
            return modelAndView;
        }
        modelAndView.setViewName("signuphome");
        return modelAndView;

    }
}
