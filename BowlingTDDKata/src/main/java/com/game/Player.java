package com.game;

public class Player extends Bowling {

    private final String name;

    public Player(String name, int[] rolls) {
        super(rolls);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
