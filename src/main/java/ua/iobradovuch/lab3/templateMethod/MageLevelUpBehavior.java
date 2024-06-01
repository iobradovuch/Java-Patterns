package ua.iobradovuch.lab3.templateMethod;

import ua.iobradovuch.lab3.models.Player;

public class MageLevelUpBehavior extends LevelUpBehavior {
    @Override
    protected void applyLevelUpBonuses(Player player) {
        player.setIntelligence(player.getIntelligence() + 5);
        player.setWisdom(player.getWisdom() + 3);
    }
}