package ua.iobradovuch.lab6.part3.replaceNestedConditionalwithGuardClauses;

public class Task5 {
    public void processOrder(int quantity, double price) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (price <= 0) {
            System.out.println("Invalid price");
            return;
        }

        // Основна логіка
        System.out.println("Order processed successfully");
    }
}
