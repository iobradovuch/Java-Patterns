package ua.iobradovuch.lab6.part5.extractSuperclass;

class Person {
    protected String name;
    protected double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}