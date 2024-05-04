package ua.iobradovuch.lab2.proxy;

import ua.iobradovuch.lab2.wrapper.PaymentService;

import java.util.HashMap;
import java.util.Map;

public class PaymentProxy implements PaymentService {
    private final Map<String, PaymentService> paymentServices = new HashMap<>();
    private PaymentService currentService;

    public void registerPaymentService(String name, PaymentService service) {
        paymentServices.put(name, service);
    }

    public void setCurrentPaymentService(String name) {
        currentService = paymentServices.get(name);
        if (currentService == null) {
            throw new IllegalArgumentException("Payment service not found: " + name);
        }
    }

    @Override
    public void processPayment(double amount) {
        if (currentService != null) {
            applyAdditionalLogic(amount);
            currentService.processPayment(amount);
        } else {
            System.out.println("No payment service selected");
        }
    }

    private void applyAdditionalLogic(double amount) {
        System.out.println("Applying additional logic for payment of $" + amount);
    }
}