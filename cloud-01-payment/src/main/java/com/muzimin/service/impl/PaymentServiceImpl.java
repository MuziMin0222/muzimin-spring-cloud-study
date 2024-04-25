package com.muzimin.service.impl;

import com.muzimin.dao.PaymentDao;
import com.muzimin.entity.Payment;
import com.muzimin.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 李煌民
 * @date: 2024-04-25 19:04
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int insertPayment(Payment payment) {
        return paymentDao.insertPayment(payment);
    }

    @Override
    public Payment selectPaymentById(int id) {
        return paymentDao.selectPaymentById(id);
    }
}
