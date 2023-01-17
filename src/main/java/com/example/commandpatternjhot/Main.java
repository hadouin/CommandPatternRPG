package com.example.commandpatternjhot;

import com.example.commandpatternjhot.command.FightAction;
import com.example.commandpatternjhot.command.Fireball;
import com.example.commandpatternjhot.command.Heal;
import com.example.commandpatternjhot.command.Lightning;
import com.example.commandpatternjhot.invoker.GameManager;
import com.example.commandpatternjhot.receiver.Dragon;
import com.example.commandpatternjhot.receiver.Wizard;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Wizard hadouin = new Wizard(100, 13, "Hadouin");
        Dragon dragon = new Dragon(100, 10, "Dragooon");

        FightAction healHadouin = new Heal(hadouin, 25);
        FightAction fireBallAtDragon = new Fireball(hadouin, 25, dragon);
        FightAction fireBallAtHadouin = new Fireball(dragon, 35, hadouin);
        FightAction lightningAtDragon = new Lightning(hadouin, 20, dragon, dragon, dragon);

        GameManager gm = new GameManager();
        gm.addAction(fireBallAtDragon);
        gm.addAction(fireBallAtHadouin);
        gm.addAction(healHadouin);
        gm.addAction(fireBallAtHadouin);
        gm.addAction(lightningAtDragon);

        while (gm.doNextAction()){
            System.out.println("");
            simulateAnim();
        }
    }

    private static void simulateAnim(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}