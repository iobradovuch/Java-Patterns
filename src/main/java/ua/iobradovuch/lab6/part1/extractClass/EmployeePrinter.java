package ua.iobradovuch.lab6.part1.extractClass;

public class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
    }
}