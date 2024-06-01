package ua.iobradovuch.lab3.models;

import lombok.EqualsAndHashCode;
import ua.iobradovuch.lab3.visitor.PlayerVisitor;

@EqualsAndHashCode(callSuper = true)
public class Mage extends Player {
    public Mage(String name) {
        super(name, 1, 0, 5, 5, 10, 10);
    }

    public Mage(String name, int level, int experience, int strength, int defense, int intelligence, int wisdom) {
        super(name, level, experience, strength, defense, intelligence, wisdom);
    }

    @Override
    public void castSpell(Spell spell) {
        System.out.println("Mage " + getName() + " casts " + spell.getName());
    }

    @Override
    public void useItem(Item item) {
        System.out.println("Mage " + getName() + " uses " + item.getName());
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Mage " + getName() + " receives message: " + message);
    }

    @Override
    public void receiveQuestUpdate(String message) {
        System.out.println("Mage " + getName() + " receives quest update: " + message);
    }

    @Override
    public void accept(PlayerVisitor visitor) {
        visitor.visit(this);
    }
}