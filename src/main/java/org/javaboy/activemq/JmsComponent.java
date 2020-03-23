package org.javaboy.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/23 22:11
 */
@Component
public class JmsComponent {

    @Resource
    JmsMessagingTemplate template;

    @Resource
    Queue queue;

    /**
     * 消息发送--->消息生产者
     * @param message 需要发送的消息
     */
    public void sendMessage(Message message){
        template.convertAndSend(this.queue, message);
    }

    /**
     * 消息接收---->消息消费者
     * @param message  需要消费的消息
     */
    @JmsListener(destination = "hello.javaboy")
    public void receive(Message message){
        System.out.println(message);
    }
}
