package com.muzimin.service;

import com.muzimin.entity.CommonResult;
import com.muzimin.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: 李煌民
 * @date: 2024-04-26 19:41
 **/
@Component
//CLOUD-01-PAYMENT eureka中注册的服务名称
@FeignClient(value = "CLOUD-01-PAYMENT")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/select/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") int id);
}
