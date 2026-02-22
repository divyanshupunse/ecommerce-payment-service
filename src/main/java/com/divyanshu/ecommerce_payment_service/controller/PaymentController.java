package com.divyanshu.ecommerce_payment_service.controller;


import com.divyanshu.ecommerce_payment_service.dto.PaymentRequest;
import com.divyanshu.ecommerce_payment_service.dto.PaymentResponse;
import com.divyanshu.ecommerce_payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public PaymentResponse makePayment(@RequestBody PaymentRequest request) {
        return paymentService.makePayment(request);
    }
}