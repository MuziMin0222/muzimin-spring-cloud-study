package com.muzimin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 李煌民
 * @date: 2024-05-14 21:09
 **/
@RestController
@RequestMapping("/client")
public class NacosClientController {

    @Value("${service-url.nacos-user-service}")
    public String serverUrl;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/call/{id}")
    public String callServer(@PathVariable String id) {
        return restTemplate.getForObject(serverUrl + "/provide/hello/" + id, String.class);
    }
}
