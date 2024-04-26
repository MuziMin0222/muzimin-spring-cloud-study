package com.muzimin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 李煌民
 * @date: 2024-04-26 13:55
 **/
@RestController
@RequestMapping("/consul")
public class OrderConsulController {

    public static final String BASE_URL = "http://CLOUD-09-PAYMENT-CONSUL-8004";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    String payment() {
        return restTemplate.getForObject(BASE_URL + "/consul/hello", String.class);
    }
}
