package ua.iobradovuch.lab6.part1.inlineClass;

public class Person {
    private String name;
    private String street;
    private String city;
    private String country;
    // Конструктор, геттери та сеттери...

    public void printAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + country);
    }
}

