package com.feng.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * Desc:
 * Created by jinx on 2017/9/22.
 */
@Component
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, String message) {
        this.jmsTemplate.convertAndSend(destination, message);
    }
}
