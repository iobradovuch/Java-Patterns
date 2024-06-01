package ua.iobradovuch.lab3.strategy;

import ua.iobradovuch.lab3.models.Player;

public class DefenseBuffStrategy implements BuffStrategy {
    @Override
    public void applyBuff(Player player) {
        player.setDefense(player.getDefense() + 10);
        System.out.println("Applied defense buff to player");
    }
}