package ua.iobradovuch.lab6.part1.moveField;

import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private Map<Employee, Double> salaries;
    // Конструктор та інші методи класу...

    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + salaries.get(employee));
        }
    }
}