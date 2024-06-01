package ua.iobradovuch.lab3.observer;

import lombok.AllArgsConstructor;
import ua.iobradovuch.lab3.models.Player;

@AllArgsConstructor
public class PlayerQuestObserver implements QuestObserver {
    private Player player;

    @Override
    public void update(String message) {
        player.receiveQuestUpdate(message);
    }
}