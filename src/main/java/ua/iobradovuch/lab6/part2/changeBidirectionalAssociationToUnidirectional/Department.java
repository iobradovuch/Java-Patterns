package ua.iobradovuch.lab6.part2.changeBidirectionalAssociationToUnidirectional;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    // Додаткові методи...
}