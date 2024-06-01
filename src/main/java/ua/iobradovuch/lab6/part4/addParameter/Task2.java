package ua.iobradovuch.lab6.part4.addParameter;

public class Task2 {
    public double calculateTotal(double price, int quantity, double taxRate) {
        double subtotal = price * quantity;
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}
