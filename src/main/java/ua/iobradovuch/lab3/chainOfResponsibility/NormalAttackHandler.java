package ua.iobradovuch.lab3.chainOfResponsibility;

import ua.iobradovuch.lab3.models.Player;

public class NormalAttackHandler implements AttackHandler {
    private AttackHandler next;
    @Override
    public void setNext(AttackHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleAttack(Player attacker, Player defender) {
        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with a normal attack!");
        if (next != null) {
            next.handleAttack(attacker, defender);
        }
    }
}