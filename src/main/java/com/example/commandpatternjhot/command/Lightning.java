package com.example.commandpatternjhot.command;

import com.example.commandpatternjhot.receiver.Avatar;

public class Lightning implements FightAction{
    private Avatar source;
    private Avatar[] targets;
    private double damage;

    public Lightning(Avatar source, double damage, Avatar... targets) {
        this.source = source;
        this.targets = targets;
        this.damage = damage;
    }

    @Override
    public void execute() {
        for (Avatar target : targets) {
            double dmg = damage - target.getShield();
            if (dmg > 0){
                System.out.println(dmg + " lightning damage taken by " + target.getName());
                target.setHealth(target.getHealth() - dmg);
            }
        }
    }
}
