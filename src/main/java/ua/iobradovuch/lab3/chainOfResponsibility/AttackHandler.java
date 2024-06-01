package ua.iobradovuch.lab3.chainOfResponsibility;

import ua.iobradovuch.lab3.models.Player;

public interface AttackHandler {
    void setNext(AttackHandler handler);
    void handleAttack(Player attacker, Player defender);
}

