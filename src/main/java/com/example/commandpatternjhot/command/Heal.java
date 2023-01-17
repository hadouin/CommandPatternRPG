package com.example.commandpatternjhot.command;

import com.example.commandpatternjhot.receiver.Avatar;

public class Heal implements FightAction{
    private Avatar target;
    private double hp;

    public Heal(Avatar target, double hp) {
        this.target = target;
        this.hp = hp;
    }

    @Override
    public void execute() {
        target.setHealth(target.getHealth() + hp);
        System.out.println(target.getName() + " healed for " + hp + " hp" );
    }
}
