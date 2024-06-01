package ua.iobradovuch.lab6.part1.moveMethod;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Bank {
    private List<Account> accounts;

    public void processAccounts() {
        for (Account account : accounts) {
            calculateInterest(account);
        }
    }

    private void calculateInterest(Account account) {
        double interest = account.getBalance() * account.getInterestRate() / 100;
        System.out.println("Interest calculated: " + interest);
        // Логіка для обчислення відсотків...
    }
}