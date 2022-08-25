package com.example.demo.api;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ResourceController {

	@Value("${example.kafka.topic}")
    private String topic;

    /*private final KafkaTemplate<String, User> kafkaTemplate;

    @PostMapping("/kmessage")
    public void sendMessage(@RequestBody User user) {
    	System.out.println("the message is recieved ------->> " + user);
        kafkaTemplate.send(topic, UUID.randomUUID().toString(), user);
    }*/
}
