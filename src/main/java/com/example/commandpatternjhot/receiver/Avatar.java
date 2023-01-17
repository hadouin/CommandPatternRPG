package com.example.commandpatternjhot.receiver;

public abstract class Avatar {
    private double health;
    private double shield;
    private String name;


    protected Avatar(double health, double shield, String name) {
        this.health = health;
        this.shield = shield;
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getShield() {
        return shield;
    }

    public void setShield(double shield) {
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
