package com.muzimin.controller;

import com.muzimin.entity.CommonResult;
import com.muzimin.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 李煌民
 * @date: 2024-04-25 20:37
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    // String BaseUrl = "http://localhost:8001";
    // 改成微服务名称，每次访问都去eureka中拿地址，就回轮训拿，达到负载均衡效果
    String BaseUrl = "http://CLOUD-01-PAYMENT";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/payment/get/{id}")
    CommonResult selecyById(@PathVariable("id") long id) {
        return restTemplate.getForObject(BaseUrl + "/payment/select/" + id, CommonResult.class);
    }

    @GetMapping("/payment/create")
    CommonResult createPayment(Payment payment) {
        return restTemplate.postForObject(BaseUrl + "/payment/insert", payment, CommonResult.class);
    }

}
