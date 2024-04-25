package com.muzimin.service;

import com.muzimin.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author: 李煌民
 * @date: 2024-04-25 19:03
 **/
public interface PaymentService {
    int insertPayment(Payment payment);

    Payment selectPaymentById(int id);
}
