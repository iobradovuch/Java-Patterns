package ua.iobradovuch.lab6.part5.collapseHierarchy;

class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}