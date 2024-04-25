package com.muzimin.dao;

import com.muzimin.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 李煌民
 * @date: 2024-04-25 18:55
 **/
@Mapper
public interface PaymentDao {
    int insertPayment(Payment payment);

    Payment selectPaymentById(@Param("id") int id);
}
