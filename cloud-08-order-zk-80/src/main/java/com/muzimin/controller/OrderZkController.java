package com.muzimin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 李煌民
 * @date: 2024-04-26 13:09
 **/
@RestController
@RequestMapping("/zk")
public class OrderZkController {

    public static final String BASE_URL = "http://cloud-07-payment-zk-8003";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/order/hello")
    public String hello() {
        return restTemplate.getForObject(BASE_URL + "/paymentzk/zk", String.class);
    }

}
