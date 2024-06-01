package ua.iobradovuch.lab5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private String customerName;
    private List<OrderItem> items;

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(OrderItem::getPrice)
                .sum();
    }
}
