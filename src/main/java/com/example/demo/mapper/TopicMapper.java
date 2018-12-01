package com.example.demo.mapper;

import com.example.demo.model.Topic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("topicMapper")
public interface TopicMapper {
    List<Topic> findAll();
    Topic findById(String id);
}
