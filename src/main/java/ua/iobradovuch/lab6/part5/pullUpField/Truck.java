package ua.iobradovuch.lab6.part5.pullUpField;

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String color, int loadCapacity) {
        super(color);
        this.loadCapacity = loadCapacity;
    }
}