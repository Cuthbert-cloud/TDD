package com.game;

public class Game {

    private final Player[] players;

    public Game() {
        this.players = new Player[2];
    }

    public void addPlayer(int i, Player player) {
        this.players[i] = player;
    }

    public Player[] getPlayers() {
        return players;
    }

    public String findWinner() {
        return players[0].score() > players[1].score() ? players[0].getName() : players[1].getName();
    }
}
