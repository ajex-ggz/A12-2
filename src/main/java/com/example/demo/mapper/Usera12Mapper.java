package com.example.demo.mapper;

import com.example.demo.model.Usera12;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component("usera12Mapper")
public interface Usera12Mapper {
    int insert(Usera12 record);

    Usera12 selectByPhoneAndPassword(@Param("phone") String phone, @Param("password") String password);
}