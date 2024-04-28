package com.muzimin.service.impl;

import com.muzimin.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: 李煌民
 * @date: 2024-04-28 13:32
 **/
@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public String paymentServiceOk() {
        return "这是一个快速效应的接口paymentServiceOk：" + Thread.currentThread().getName();
    }

    public String paymentServiceTimeOut() {
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "这是一个需要延迟等待的接口PaymentServiceTimeOut：" + Thread.currentThread().getName();
    }
}
