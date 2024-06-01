package ua.iobradovuch.lab3.templateMethod;

import ua.iobradovuch.lab3.models.Player;

public class WarriorLevelUpBehavior extends LevelUpBehavior {
    @Override
    protected void applyLevelUpBonuses(Player player) {
        player.setStrength(player.getStrength() + 5);
        player.setDefense(player.getDefense() + 3);
    }
}