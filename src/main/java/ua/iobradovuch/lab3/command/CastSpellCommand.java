package ua.iobradovuch.lab3.command;

import lombok.AllArgsConstructor;
import ua.iobradovuch.lab3.models.Player;
import ua.iobradovuch.lab3.models.Spell;

@AllArgsConstructor
public class CastSpellCommand implements PlayerCommand {
    private Player player;
    private Spell spell;

    @Override
    public void execute() {
        player.castSpell(spell);
    }
}