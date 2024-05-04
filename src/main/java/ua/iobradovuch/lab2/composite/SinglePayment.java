package ua.iobradovuch.lab2.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SinglePayment implements Payment {
    private double amount;

    @Override
    public void processPayment() {
        System.out.println("Processing single payment of $" + amount);
    }
}