package ua.iobradovuch.lab2.flyweight;

import lombok.Data;

@Data
class CreditCardPaymentMethod implements PaymentMethod {
    private final String name;
    private final String cardNumber;
    private final String expirationDate;
    private final int cvv;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " with credit card " + cardNumber);
    }
}