package org.javaboy.activemq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ActivemqApplicationTests {

    @Autowired
    JmsComponent jmsComponent;

    @Test
    void contextLoads() {

        Message message = new Message();
        message.setContent("Hello ActiveMQ");
        message.setSendDate(new Date());
        jmsComponent.sendMessage(message);

    }

}
