package com.muzimin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: 李煌民
 * @date: 2024-04-28 14:00
 **/
@FeignClient(value = "CLOUD-13-PAYMENT-HYSTRIX-8001")
@Component
public interface PaymentHystrixService {
    @GetMapping("/hystrix/ok")
    public String paymentServiceOk();

    @GetMapping("/hystrix/timeout")
    public String paymentServiceTimeOut();
}
