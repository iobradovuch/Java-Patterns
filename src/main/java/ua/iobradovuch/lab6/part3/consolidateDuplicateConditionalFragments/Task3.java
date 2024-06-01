package ua.iobradovuch.lab6.part3.consolidateDuplicateConditionalFragments;

public class Task3 {
    public void processOrder(int quantity, double price) {
        boolean applyDiscount = false;

        if (quantity > 10) {
            // Операція 1
            applyDiscount = true;
        } else {
            // Операція 1
        }

        if (price > 100) {
            // Операція 2
            applyDiscount = true;
        } else {
            // Операція 2
        }

        if (applyDiscount) {
            applyDiscount();
        }
    }
}
