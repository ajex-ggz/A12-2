package com.example.demo.service;

import com.example.demo.mapper.TopicMapper;
import com.example.demo.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("topicService")
public class TopicServiceImpl implements TopicService{
    @Autowired
    private TopicMapper topicMapper;

    @Override
    public List<Topic> findAll(){
        return topicMapper.findAll();
    }
}
