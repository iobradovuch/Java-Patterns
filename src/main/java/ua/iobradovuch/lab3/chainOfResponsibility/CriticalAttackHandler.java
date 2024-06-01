package ua.iobradovuch.lab3.chainOfResponsibility;

import ua.iobradovuch.lab3.models.Player;

public class CriticalAttackHandler implements AttackHandler {
    private AttackHandler next;
    @Override
    public void setNext(AttackHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleAttack(Player attacker, Player defender) {
        if (Math.random() < 0.2) {
            System.out.println(attacker.getName() + " lands a critical attack on " + defender.getName() + "!");
        }
        if (next != null) {
            next.handleAttack(attacker, defender);
        }
    }
}