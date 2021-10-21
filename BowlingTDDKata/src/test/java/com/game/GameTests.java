package com.game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTests {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void Players() {
        int[] rolls = { 0,0 ,0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 };
        Player player1 = new Player("", rolls);
        Assertions.assertNotNull(player1);
    }

    @Test
    void setUpGame() {
        int[] rolls = { 0,0 ,0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 };
        Player player1 = new Player("com.game.Player 1", rolls);
        Game game = new Game();
        game.addPlayer(0, player1);
        Assertions.assertNotNull(game);
        Assertions.assertNotNull(player1);
        Assertions.assertNotEquals(null, game.getPlayers());
    }

    @Test
    void getNames() {
        int[] rolls_1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] rolls_2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Game game = new Game();
        Player player1 = new Player("com.game.Player 1", rolls_1);
        Player player2 = new Player("com.game.Player 2", rolls_2);
        game.addPlayer(0, player1);
        game.addPlayer(1, player2);
        Assertions.assertEquals("com.game.Player 1", player1.getName());
        Assertions.assertEquals("com.game.Player 2", player2.getName());
    }

    @Test
    void gameTest() {
        int[] rolls_1 = {0,0, 5,4, 6,4, 1,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        int[] rolls_2 = {0,0, 5,4, 10, 1,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        Game game = new Game();
        Player player1 = new Player("com.game.Player 1", rolls_1);
        Player player2 = new Player("com.game.Player 2", rolls_2);
        game.addPlayer(0, player1);
        game.addPlayer(1, player2);
        Assertions.assertEquals("com.game.Player 2",game.findWinner());
    }
}
