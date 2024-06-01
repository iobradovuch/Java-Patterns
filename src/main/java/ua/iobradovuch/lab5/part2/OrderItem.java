package ua.iobradovuch.lab5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {
    private String name;
    private double price;
}
