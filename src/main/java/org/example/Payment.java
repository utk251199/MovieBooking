package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus status;
    private LocalDateTime paymentTime;

    public Payment(int paymentId, int bookingId, double amount, PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = PaymentStatus.PENDING;
        this.paymentTime = LocalDateTime.now();
    }

    public void processPayment() {
        this.status = PaymentStatus.SUCCESS;
    }

    // Getters
    public int getPaymentId() { return paymentId; }
    public int getBookingId() { return bookingId; }
    public double getAmount() { return amount; }
    public PaymentMethod getPaymentMethod() { return paymentMethod; }
    public PaymentStatus getStatus() { return status; }
    public LocalDateTime getPaymentTime() { return paymentTime; }
}

enum PaymentMethod {
    CREDIT_CARD,
    DEBIT_CARD,
    UPI,
    NET_BANKING
}

enum PaymentStatus {
    PENDING,
    SUCCESS,
    FAILED
}
