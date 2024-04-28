package com.muzimin.controller;

import com.muzimin.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 李煌民
 * @date: 2024-04-28 14:02
 **/
@RestController
@RequestMapping("/hystrix")
public class OrderHystrixController {

    @Autowired
    PaymentHystrixService paymentHystrixService;

    @GetMapping("/order/ok")
    public String paymentServiceOk(){
        return paymentHystrixService.paymentServiceOk();
    }

    @GetMapping("/order/timeout")
    public String PaymentServiceTimeOut(){
        return paymentHystrixService.paymentServiceTimeOut();
    }
}
