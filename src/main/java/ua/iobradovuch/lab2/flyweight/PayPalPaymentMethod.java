package ua.iobradovuch.lab2.flyweight;

import lombok.Data;

@Data
class PayPalPaymentMethod implements PaymentMethod {
    private final String name;
    private final String email;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " with PayPal account " + email);
    }
}