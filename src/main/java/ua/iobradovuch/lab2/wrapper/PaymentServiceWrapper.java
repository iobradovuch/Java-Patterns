package ua.iobradovuch.lab2.wrapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentServiceWrapper {
    private final PaymentService paymentService;

    public void processPayment(double amount) {
        paymentService.processPayment(amount);
    }
}