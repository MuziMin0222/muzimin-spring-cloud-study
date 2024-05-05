package com.muzimin.service;

/**
 * @author: 李煌民
 * @date: 2024-04-28 13:31
 **/
public interface PaymentService {

    public String paymentServiceOk();

    public String paymentServiceTimeOut();

    String paymentCircuitBreaker(Integer id);

}
