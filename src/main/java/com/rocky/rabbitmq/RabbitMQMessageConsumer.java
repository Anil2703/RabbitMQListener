package com.rocky.rabbitmq;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageConsumer {

    @RabbitListener(queues = {"${spring.rabbitmq.queue}"})
    public void receiveMessage(final Message message){
        try{
            if(message!=null){
                System.out.println(message);
            }
        }catch (Exception e){
            System.out.println("Error while reading message from RabbitMQ");
        }
    }
}
