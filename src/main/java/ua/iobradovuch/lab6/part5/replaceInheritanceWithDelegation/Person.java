package ua.iobradovuch.lab6.part5.replaceInheritanceWithDelegation;

class Person {
    private final Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}