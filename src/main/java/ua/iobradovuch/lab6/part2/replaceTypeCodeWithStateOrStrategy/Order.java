package ua.iobradovuch.lab6.part2.replaceTypeCodeWithStateOrStrategy;

public class Order {
    private OrderStatus status;

    public Order() {
        this.status = new NewOrderStatus();
    }

    public void processOrder() {
        status.processOrder(this);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // Інші методи класу...
}