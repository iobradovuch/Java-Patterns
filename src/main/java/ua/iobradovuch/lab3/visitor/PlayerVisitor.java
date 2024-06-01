package ua.iobradovuch.lab3.visitor;

import ua.iobradovuch.lab3.models.Mage;
import ua.iobradovuch.lab3.models.Warrior;

public interface PlayerVisitor {
    void visit(Warrior warrior);
    void visit(Mage mage);
}