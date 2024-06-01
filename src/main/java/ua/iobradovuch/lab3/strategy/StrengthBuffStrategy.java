package ua.iobradovuch.lab3.strategy;

import ua.iobradovuch.lab3.models.Player;

public class StrengthBuffStrategy implements BuffStrategy {
    @Override
    public void applyBuff(Player player) {
        player.setStrength(player.getStrength() + 10);
        System.out.println("Applied strength buff to player");
    }
}