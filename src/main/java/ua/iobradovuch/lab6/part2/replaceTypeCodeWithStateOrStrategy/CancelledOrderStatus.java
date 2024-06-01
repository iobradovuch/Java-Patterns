package ua.iobradovuch.lab6.part2.replaceTypeCodeWithStateOrStrategy;

public class CancelledOrderStatus implements OrderStatus {
    @Override
    public void processOrder(Order order) {
        // Поведінка для скасованого замовлення
    }
}
