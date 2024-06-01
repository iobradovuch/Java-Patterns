package ua.iobradovuch.lab6.part1.extractClass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private String department;
    private double salary;
    // Конструктор та інші методи класу...
}