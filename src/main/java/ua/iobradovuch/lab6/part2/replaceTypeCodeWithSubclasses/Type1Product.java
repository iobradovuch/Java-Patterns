package ua.iobradovuch.lab6.part2.replaceTypeCodeWithSubclasses;

public class Type1Product extends Product {
    public Type1Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        // Поведінка для типу 1
    }
}