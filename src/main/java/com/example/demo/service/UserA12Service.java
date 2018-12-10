package com.example.demo.service;

import com.example.demo.model.Usera12;

public interface UserA12Service {
    Usera12 selectByPhoneAndPassword(String phone,String password);
    //Usera12 selectOne(Usera12 user);
    int insert(Usera12 usera12);
}
