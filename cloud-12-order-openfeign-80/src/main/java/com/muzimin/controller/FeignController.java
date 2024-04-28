package com.muzimin.controller;

import com.muzimin.entity.CommonResult;
import com.muzimin.entity.Payment;
import com.muzimin.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 李煌民
 * @date: 2024-04-26 19:43
 **/
@RestController
@Slf4j
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    PaymentFeignService paymentFeignService;

    @GetMapping("/get/{id}")
    CommonResult<Payment> helloFeign(@PathVariable int id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/timeout")
    CommonResult<String> feignTimeOutTest() {
        return paymentFeignService.testFeignTimeOUt();
    }
}
