package ua.iobradovuch.lab6.part2.replaceTypeCodeWithSubclasses;

public class DefaultProduct extends Product {
    public DefaultProduct(String name) {
        super(name);
    }

    @Override
    public void process() {
        // Поведінка за замовчуванням
    }
}