package ua.iobradovuch.lab2.wrapper;

public class GooglePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Google");
    }
}