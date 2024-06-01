package ua.iobradovuch.lab6.part5.replaceInheritanceWithDelegation;

class Dog {
    private final Animal animal = new Animal();

    void bark() {
        System.out.println("Dog is barking");
    }

    void eat() {
        animal.eat();
    }

    void sleep() {
        animal.sleep();
    }
}