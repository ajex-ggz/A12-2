package com.example.demo.service;

import com.example.demo.mapper.Usera12Mapper;
import com.example.demo.model.Usera12;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserA12ServiecImpl implements UserA12Service {
    @Autowired
    private Usera12Mapper usera12Mapper;

    @Override
    public Usera12 selectByPhoneAndPassword(String phone,String password){
        System.out.println("*******************");
        System.out.println(phone);
        System.out.println(password);
        System.out.println("************************");
        return usera12Mapper.selectByPhoneAndPassword(phone,password);
    }
    /*
    @Override
    public Usera12 selectOne(Usera12 user){
        return usera12Mapper.selectOne(user);
    }
    */
    @Override
    public int insert(Usera12 usera12){
        return usera12Mapper.insert(usera12);
    }
}
