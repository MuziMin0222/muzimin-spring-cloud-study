package com.muzimin.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author: 李煌民
 * @date: 2024-05-13 21:37
 **/
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageService {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    void receiveMessage(Message<String> message) {
        String content = "port:" + serverPort + "接收到的消息：" + message.getPayload();
        System.out.println(content);
    }

}
