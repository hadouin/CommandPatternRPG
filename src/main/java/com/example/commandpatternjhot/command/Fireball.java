package com.example.commandpatternjhot.command;

import com.example.commandpatternjhot.receiver.Avatar;

public class Fireball implements FightAction {
    private Avatar source;
    private Avatar target;
    private double damage;

    public Fireball(Avatar source, double damage, Avatar target) {
        this.source = source;
        this.target = target;
        this.damage = damage;
    }

    @Override
    public void execute() {
        double dmg = damage - target.getShield();
        if (dmg > 0){
            System.out.println(dmg + " damage taken by " + target.getName());
            target.setHealth(target.getHealth() - dmg);
        }
    }
}
