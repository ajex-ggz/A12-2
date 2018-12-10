package com.example.demo.controller;

import com.example.demo.model.Usera12;
import com.example.demo.service.UserA12Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@ResponseBody
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserA12Service userA12Service;

    @RequestMapping(value = "/loginAction",method = RequestMethod.POST)
    public ModelAndView loginAction(@ModelAttribute Usera12 usera12){
        ModelAndView modelAndView = new ModelAndView();
        String phone = usera12.getPhone();
        String password = usera12.getPassword();
        System.out.print(phone + "\n" + password);
        Usera12 selectUserA12 = userA12Service.selectByPhoneAndPassword(phone,password);
        System.out.println(selectUserA12.getUsername());
        if(selectUserA12 == null){
            modelAndView.addObject("error","账号或密码错误！");
            modelAndView.setViewName("login");
            return modelAndView;
        }
        modelAndView.addObject("userName",selectUserA12.getUsername());
        modelAndView.setViewName("home");
        return modelAndView;

    }

}
