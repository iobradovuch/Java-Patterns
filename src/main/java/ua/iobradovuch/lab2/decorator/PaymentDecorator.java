package ua.iobradovuch.lab2.decorator;

import lombok.RequiredArgsConstructor;
import ua.iobradovuch.lab2.composite.Payment;

@RequiredArgsConstructor
abstract class PaymentDecorator implements Payment {
    protected final Payment payment;

    @Override
    public double getAmount() {
        return payment.getAmount();
    }

    @Override
    public void processPayment() {
        payment.processPayment();
    }
}