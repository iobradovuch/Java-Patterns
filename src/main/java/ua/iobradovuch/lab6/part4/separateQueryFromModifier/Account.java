package ua.iobradovuch.lab6.part4.separateQueryFromModifier;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void deductCommission() {
        double commission = 0.05;
        balance -= balance * commission;
    }
}