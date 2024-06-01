package ua.iobradovuch.lab3.visitor;

import ua.iobradovuch.lab3.models.Mage;
import ua.iobradovuch.lab3.models.Warrior;

public class PlayerBuffVisitor implements PlayerVisitor {
    @Override
    public void visit(Warrior warrior) {
        warrior.setStrength(warrior.getStrength() + 5);
    }

    @Override
    public void visit(Mage mage) {
        mage.setIntelligence(mage.getIntelligence() + 5);
    }
}