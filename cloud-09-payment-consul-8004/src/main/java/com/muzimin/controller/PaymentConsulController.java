package com.muzimin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: 李煌民
 * @date: 2024-04-26 13:42
 **/
@RestController
@RequestMapping("/consul")
public class PaymentConsulController {

    @GetMapping("/hello")
    String helloConsul() {
        return "springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

    @Value("${server.port}")
    private String serverPort;
}
