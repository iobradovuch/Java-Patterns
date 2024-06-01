package ua.iobradovuch.lab6.part2.replaceTypeCodeWithStateOrStrategy;

public class CompletedOrderStatus implements OrderStatus {
    @Override
    public void processOrder(Order order) {
        // Поведінка для завершеного замовлення
    }
}