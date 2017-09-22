package com.feng;

import com.feng.demo1.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ActivemqApplication.class)
public class ActivemqApplicationTests {

    @Autowired
    private Producer jmsProducer;

    @Test
    public void testJms() {
        Destination destination = new ActiveMQQueue("springboot.queue.test");

        for (int i = 0; i < 10; i++) {
            jmsProducer.sendMessage(destination, "hello,world!" + i);
        }
    }

}
