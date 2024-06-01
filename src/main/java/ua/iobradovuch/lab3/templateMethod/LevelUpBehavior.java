package ua.iobradovuch.lab3.templateMethod;

import ua.iobradovuch.lab3.models.Player;

public abstract class LevelUpBehavior {
    public final void levelUp(Player player) {
        increaseLevelByOne(player);
        applyLevelUpBonuses(player);
        resetExperience(player);
        printLevelUpMessage(player);
    }

    protected abstract void applyLevelUpBonuses(Player player);

    private void increaseLevelByOne(Player player) {
        player.setLevel(player.getLevel() + 1);
    }

    private void resetExperience(Player player) {
        player.setExperience(0);
    }

    private void printLevelUpMessage(Player player) {
        System.out.println("Player " + player.getName() + " has reached level " + player.getLevel());
    }
}
