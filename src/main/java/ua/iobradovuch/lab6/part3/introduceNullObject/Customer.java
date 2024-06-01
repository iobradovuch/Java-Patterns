package ua.iobradovuch.lab6.part3.introduceNullObject;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address != null ? address : new NullAddress();
    }
}