package ua.iobradovuch.lab6.part5.pullUpConstructorBody;

class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
}