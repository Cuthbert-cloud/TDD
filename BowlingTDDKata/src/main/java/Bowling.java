public class Bowling {

    private int[] rolls;
    private int frameStart;
    private int totalScore = 0;

    public Bowling(int[] rolls) {
        this.rolls = rolls;
        this.frameStart = 0;
        this.totalScore = 0;
    }

    public int rollSum(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += this.rolls[this.frameStart + i];
        }
        return total;
    }

    public int scoreIncrement() {
        if (this.strike()) {
            return this.rollSum(3);
        } else if (this.spare()) {
            return this.rollSum(3);
        } else {
            return this.rollSum(2);
        }
    }

    public boolean spare() {
        return this.rolls[this.frameStart] + this.rolls[this.frameStart + 1] == 10;
    }

    public boolean strike() {
        return this.rolls[this.frameStart] == 10;
    }

    public void updateFrameStart() {
        if (this.strike()) {
            this.frameStart += 1;
        } else {
            this.frameStart += 2;
        }
    }

    public void updateScore() {
        this.totalScore += this.scoreIncrement();
    }

    public int score() {
        for (int frame = 1; frame <= 10; frame++) {
            this.updateScore();
            this.updateFrameStart();
        }
        return this.totalScore;
    }
}
