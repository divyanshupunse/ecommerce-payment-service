package com.divyanshu.ecommerce_payment_service.dto;

import com.divyanshu.ecommerce_payment_service.entity.PaymentStatus;

public class PaymentResponse {

    private int PaymentId;
    private int OrderId;
    private PaymentStatus status;
    private double amount;

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int paymentId) {
        PaymentId = paymentId;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
