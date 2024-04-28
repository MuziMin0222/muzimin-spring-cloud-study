package com.muzimin.service;

import com.muzimin.service.impl.PaymentHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: 李煌民
 * @date: 2024-04-28 14:00
 **/
// FeignFallback 客户端的服务降级 针对 CLOUD-13-PAYMENT-HYSTRIX-8001 该服务 提供了一个 对应的服务降级类
@FeignClient(value = "CLOUD-13-PAYMENT-HYSTRIX-8001",fallback = PaymentHystrixServiceImpl.class)
@Component
public interface PaymentHystrixService {
    @GetMapping("/hystrix/ok")
    public String paymentServiceOk();

    @GetMapping("/hystrix/timeout")
    public String paymentServiceTimeOut();
}
