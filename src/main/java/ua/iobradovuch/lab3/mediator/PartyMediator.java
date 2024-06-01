package ua.iobradovuch.lab3.mediator;

import ua.iobradovuch.lab3.models.Player;

public interface PartyMediator {
    void sendMessage(Player player, String message);
    void addPlayer(Player player);
    void removePlayer(Player player);
}