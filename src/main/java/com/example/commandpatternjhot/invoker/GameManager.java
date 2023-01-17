package com.example.commandpatternjhot.invoker;

import com.example.commandpatternjhot.command.FightAction;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameManager {
    private Deque<FightAction> actions = new ArrayDeque<>();

    public void addAction(FightAction action){
        actions.add(action);
    }

    public boolean doNextAction(){
        actions.pop().execute();
        return !actions.isEmpty();
    }
}
