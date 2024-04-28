package com.muzimin.service.impl;

import com.muzimin.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author: 李煌民
 * @date: 2024-04-28 21:52
 **/
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentServiceOk() {
        return "当服务端中的paymentServiceOk方法出现了异常，消费端开始调用该方法进行服务降级";
    }

    @Override
    public String paymentServiceTimeOut() {
        return "当服务端中的paymentServiceTimeOut方法出现了异常，消费端开始调用该方法进行服务降级";
    }
}
