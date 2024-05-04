package ua.iobradovuch.lab2.facade;

import lombok.RequiredArgsConstructor;
import ua.iobradovuch.lab2.wrapper.PaymentService;

import java.util.List;

@RequiredArgsConstructor
public class PaymentFacade {
    private final List<PaymentService> paymentServices;

    public void processPayment(double amount) {
        paymentServices.forEach(service -> service.processPayment(amount));
    }
}