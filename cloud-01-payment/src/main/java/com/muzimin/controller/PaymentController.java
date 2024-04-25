package com.muzimin.controller;

import com.muzimin.entity.CommonResult;
import com.muzimin.entity.Payment;
import com.muzimin.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: 李煌民
 * @date: 2024-04-25 19:05
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @PostMapping("/insert")
    CommonResult<Payment> insertData(Payment payment) {
        int i = paymentService.insertPayment(payment);
        if (i > 0) {
            return new CommonResult<>(200, "数据插入成功", payment);
        } else {
            return new CommonResult<>(400, "数据插入失败", payment);
        }
    }

    @GetMapping("/select/{id}")
    CommonResult<Payment> selectData(@PathVariable("id") int id) {
        Payment payment = paymentService.selectPaymentById(id);
        if (payment != null) {
            return new CommonResult<>(200, "数据查询成功", payment);
        } else {
            return new CommonResult<Payment>(400, "数据查询失败");
        }
    }
}
