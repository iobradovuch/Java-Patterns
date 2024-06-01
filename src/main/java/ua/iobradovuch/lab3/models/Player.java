package ua.iobradovuch.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.iobradovuch.lab3.memento.PlayerMemento;
import ua.iobradovuch.lab3.visitor.PlayerVisitor;

@Data
@AllArgsConstructor
public abstract class Player {
    private String name;
    private int level;
    private int experience;
    private int strength;
    private int defense;
    private int intelligence;
    private int wisdom;

    public abstract void castSpell(Spell spell);
    public abstract void useItem(Item item);
    public abstract void receiveMessage(String message);
    public abstract void receiveQuestUpdate(String message);
    public abstract void accept(PlayerVisitor visitor);

    public PlayerMemento saveState() {
        return new PlayerMemento(this);
    }

    public void restoreState(PlayerMemento memento) {
        this.name = memento.getName();
        this.level = memento.getLevel();
        this.experience = memento.getExperience();
    }
}