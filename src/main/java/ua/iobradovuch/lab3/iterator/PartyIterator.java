package ua.iobradovuch.lab3.iterator;

import ua.iobradovuch.lab3.models.Player;

import java.util.Iterator;
import java.util.List;

public class PartyIterator implements Iterator<Player> {
    private List<Player> players;
    private int index;
    public PartyIterator(List<Player> players) {
        this.players = players;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < players.size();
    }

    @Override
    public Player next() {
        if (hasNext()) {
            return players.get(index++);
        }
        return null;
    }
}