package ua.iobradovuch.lab3.command;

import lombok.AllArgsConstructor;
import ua.iobradovuch.lab3.models.Item;
import ua.iobradovuch.lab3.models.Player;

@AllArgsConstructor
public class UseItemCommand implements PlayerCommand {
    private Player player;
    private Item item;

    @Override
    public void execute() {
        player.useItem(item);
    }
}