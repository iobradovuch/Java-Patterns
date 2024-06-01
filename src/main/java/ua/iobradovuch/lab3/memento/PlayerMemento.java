package ua.iobradovuch.lab3.memento;

import ua.iobradovuch.lab3.models.Player;

public class PlayerMemento {
    private String name;
    private int level;
    private int experience;

    public PlayerMemento(Player player) {
        this.name = player.getName();
        this.level = player.getLevel();
        this.experience = player.getExperience();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
}