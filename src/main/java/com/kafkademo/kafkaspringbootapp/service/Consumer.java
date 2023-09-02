package com.kafkademo.kafkaspringbootapp.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "Demo_Topic", groupId = "demo_topic_group")
    public void listenToTopic(String recievedMessage){
        System.out.println("The message recieved is : " + recievedMessage);
    }
}
