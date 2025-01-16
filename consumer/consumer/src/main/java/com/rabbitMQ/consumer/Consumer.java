package com.rabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = "${queue}")
    public void handler(String message){
        System.out.println("Message FROM Producer: " +  message);
    }
}
