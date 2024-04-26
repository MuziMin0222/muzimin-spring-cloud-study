package com.muzimin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: 李煌民
 * @date: 2024-04-26 11:05
 **/
@RestController
@RequestMapping("/paymentzk")
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
