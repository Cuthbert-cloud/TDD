import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTests {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void Balls() {
        int[] rolls = { 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling game = new Bowling(rolls);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    void OpenFrame() {
        int[] rolls = {0,0, 5,4, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling game = new Bowling(rolls);
        Assertions.assertEquals(9, game.score());
    }

    @Test
    void Spare() {
        int[] rolls = {0,0, 5,4, 6,4, 1,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling game = new Bowling(rolls);
        Assertions.assertEquals(24, game.score());
    }

    @Test
    void Strike() {
        int[] rolls = {0,0, 5,4, 10, 1,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling game = new Bowling(rolls);
        Assertions.assertEquals(27, game.score());
    }

    @Test
    void Maximum() {
        int[] rolls = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Bowling game = new Bowling(rolls);
        Assertions.assertEquals(300, game.score());
    }

    @Test
    void Alternating_200() {
        int[] rolls = {6,4, 10, 6,4, 10, 6,4, 10, 6,4, 10, 6,4, 10, 6,4};
        Bowling game = new Bowling(rolls);
        Assertions.assertEquals(200, game.score());
    }
}
