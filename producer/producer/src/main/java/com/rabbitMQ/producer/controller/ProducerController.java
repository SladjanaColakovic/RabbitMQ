package com.rabbitMQ.producer.controller;

import com.rabbitMQ.producer.service.impl.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/producer")
public class ProducerController {

    @Autowired
    private Producer producer;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message){
        producer.sendMessage(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
