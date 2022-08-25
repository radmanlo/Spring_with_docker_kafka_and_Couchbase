package com.example.demo.services;


import lombok.extern.slf4j.Slf4j;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Slf4j
@Service
public class KafkaListenerService {

    @KafkaListener(
            topics = "${example.kafka.topic}",
            groupId = "${example.kafka.group.id}"
    )
    public void listen(@Payload User user) {
        log.info("Message received.. %s", user.toString());
        System.out.println("====================>>>>>>>>>>>>>>>>>>>>> Data is Recieved  ==========>>" + user);
    } 
}
