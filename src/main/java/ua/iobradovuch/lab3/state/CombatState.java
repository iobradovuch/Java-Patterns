package ua.iobradovuch.lab3.state;

public class CombatState implements PlayerState {
    @Override
    public void handle(PlayerContext context) {
        System.out.println("Player is in combat state");
    }
}