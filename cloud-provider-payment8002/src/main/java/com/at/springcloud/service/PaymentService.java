package com.at.springcloud.service;

import com.at.springcloud.entities.Payment;

/**
 * @author sealll
 * @time 2021/5/8 21:26
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
