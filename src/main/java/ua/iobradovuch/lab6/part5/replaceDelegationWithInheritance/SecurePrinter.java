package ua.iobradovuch.lab6.part5.replaceDelegationWithInheritance;

class SecurePrinter extends Printer {
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}