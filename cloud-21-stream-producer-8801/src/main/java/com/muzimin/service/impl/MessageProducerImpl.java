package com.muzimin.service.impl;

import cn.hutool.core.util.IdUtil;
import com.muzimin.service.MessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

/**
 * @author: 李煌民
 * @date: 2024-05-10 22:09
 * 定义消息的推送管道 将Channel和Exchanges绑定在一起
 **/
@Slf4j
@EnableBinding(Source.class)
public class MessageProducerImpl implements MessageProducer {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String content = IdUtil.simpleUUID();

        Message<String> message = MessageBuilder
                .withPayload(content)
                .build();
        output.send(message);
        log.info("开始发送数据到rabbitMQ中，消息：" + content);
        return content;
    }
}
