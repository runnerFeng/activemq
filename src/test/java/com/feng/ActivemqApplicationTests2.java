package com.feng;

import com.feng.demo2.JMSProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Queue;
import javax.jms.Topic;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ActivemqApplication.class)
public class ActivemqApplicationTests2 {

    @Autowired
    private JMSProducer jmsProducer;
    @Autowired
    private Topic topic;
    @Autowired
    private Queue queue;

    @Test
    public void testJms() {
        for (int i = 0; i < 10; i++) {
            jmsProducer.sendMessage(queue, "queue,world!" + i);
            jmsProducer.sendMessage(topic, "topic,world!" + i);
        }
    }

}
