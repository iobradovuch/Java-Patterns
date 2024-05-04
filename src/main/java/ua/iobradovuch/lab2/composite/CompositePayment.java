package ua.iobradovuch.lab2.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CompositePayment implements Payment {
    private List<Payment> payments;

    @Override
    public double getAmount() {
        return payments.stream()
                .mapToDouble(Payment::getAmount)
                .sum();
    }

    @Override
    public void processPayment() {
        payments.forEach(Payment::processPayment);
    }
}