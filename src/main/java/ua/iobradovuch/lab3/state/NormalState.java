package ua.iobradovuch.lab3.state;

public class NormalState implements PlayerState {
    @Override
    public void handle(PlayerContext context) {
        System.out.println("Player is in normal state");
    }
}