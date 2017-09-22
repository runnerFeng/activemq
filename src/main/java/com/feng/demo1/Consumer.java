package com.feng.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * Created by jinx on 2017/9/22.
 */
@Component
public class Consumer {
    private final static Logger logger = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "springboot.queue.test")
    public void receiveQueue(String msg) {
        logger.info("接收到消息：{}", msg);
    }
}
