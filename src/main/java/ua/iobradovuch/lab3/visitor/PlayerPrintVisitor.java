package ua.iobradovuch.lab3.visitor;

import ua.iobradovuch.lab3.models.Mage;
import ua.iobradovuch.lab3.models.Warrior;

public class PlayerPrintVisitor implements PlayerVisitor {
    @Override
    public void visit(Warrior warrior) {
        System.out.println("Warrior: " + warrior.getName());
    }

    @Override
    public void visit(Mage mage) {
        System.out.println("Mage: " + mage.getName());
    }
}