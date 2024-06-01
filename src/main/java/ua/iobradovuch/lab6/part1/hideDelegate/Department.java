package ua.iobradovuch.lab6.part1.hideDelegate;

public class Department {
    private String name;
    private Employee manager;
    // Конструктор та інші методи класу...

    public String getManagerName() {
        return manager.getName();
    }
}