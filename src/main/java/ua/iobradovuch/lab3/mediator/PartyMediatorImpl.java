package ua.iobradovuch.lab3.mediator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ua.iobradovuch.lab3.models.Player;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class PartyMediatorImpl implements PartyMediator {
    private List<Player> players = new ArrayList<>();

    @Override
    public void sendMessage(Player player, String message) {
        players.stream()
                .filter(p -> p != player)
                .forEach(p -> p.receiveMessage(message));
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);
    }
}