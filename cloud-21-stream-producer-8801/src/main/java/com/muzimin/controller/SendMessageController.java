package com.muzimin.controller;

import com.muzimin.service.MessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 李煌民
 * @date: 2024-05-11 07:44
 **/
@RestController
@RequestMapping("/stream")
public class SendMessageController {

    @Resource
    MessageProducer messageProducer;

    @GetMapping("/send")
    String sendMessage() {
        return messageProducer.send();
    }

}
