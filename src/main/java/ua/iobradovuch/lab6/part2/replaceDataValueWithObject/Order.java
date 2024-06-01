package ua.iobradovuch.lab6.part2.replaceDataValueWithObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private Customer customer;
    private Amount amount;
    // Конструктор та інші методи класу...

    // Інші методи класу...
}