package com.divyanshu.ecommerce_payment_service.service;

import com.divyanshu.ecommerce_payment_service.dto.PaymentRequest;
import com.divyanshu.ecommerce_payment_service.dto.PaymentResponse;
import com.divyanshu.ecommerce_payment_service.entity.Payment;
import com.divyanshu.ecommerce_payment_service.entity.PaymentStatus;
import com.divyanshu.ecommerce_payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public PaymentResponse makePayment(PaymentRequest request){

        if (request.getAmount() <= 0) {
            throw new RuntimeException("Invalid payment amount");
        }

        Optional<Payment> existing = repository.findByOrderId(request.getOrderId());
        if (existing.isPresent()) {
            throw new RuntimeException("Payment already processed for this order");
        }

        Payment payment = new Payment();
        payment.setOrderId(request.getOrderId());
        payment.setAmount(request.getAmount());

        // Simulate payment logic
        if (request.getAmount() > 100000) {
            payment.setPaymentStatus(PaymentStatus.FAILED);
        } else {
            payment.setPaymentStatus(PaymentStatus.SUCCESS);
        }

        payment.setDateTime(LocalDateTime.now());

        repository.save(payment);

        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(payment.getId());
        response.setOrderId(payment.getOrderId());
        response.setAmount(payment.getAmount());
        response.setStatus(payment.getPaymentStatus());

        return response;
    }

}
