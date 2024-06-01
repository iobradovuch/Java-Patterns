package ua.iobradovuch.lab6.part2.selfEncapsulateField;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private double salary;
    // Конструктор та інші методи класу...

    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }
    // Інші методи класу...
}