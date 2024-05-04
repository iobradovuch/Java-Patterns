package ua.iobradovuch.lab2.bridge;

public class GooglePaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Google Gateway");
    }
}