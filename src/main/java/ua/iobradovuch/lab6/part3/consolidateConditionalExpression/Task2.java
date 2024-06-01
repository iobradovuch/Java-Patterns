package ua.iobradovuch.lab6.part3.consolidateConditionalExpression;

public class Task2 {
    public void processPayment(double amount, boolean isMember, boolean isDiscountAvailable) {
        if ((amount > 100 && isMember) || (amount > 200 && isDiscountAvailable)) {
            applyDiscount();
        }
    }
}
