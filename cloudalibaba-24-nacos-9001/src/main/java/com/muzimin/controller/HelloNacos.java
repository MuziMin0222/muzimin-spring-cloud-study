package com.muzimin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 李煌民
 * @date: 2024-05-14 20:40
 **/
@RestController
@RequestMapping("/provide")
public class HelloNacos {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello/{id}")
    String hellNacos(@PathVariable String id) {
        return "这是一个Nacos服务，port：" + port + ", ID为" + id;
    }
}
