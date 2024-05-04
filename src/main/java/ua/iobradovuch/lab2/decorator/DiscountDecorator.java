package ua.iobradovuch.lab2.decorator;

import ua.iobradovuch.lab2.composite.Payment;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public double getAmount() {
        return super.getAmount() * 0.9;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment with 10% discount");
        super.processPayment();
    }
}