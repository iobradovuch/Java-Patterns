package ua.iobradovuch.lab6.part2.replaceTypeCodeWithSubclasses;

public abstract class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void process();
    // Додаткові методи...
}