package BowlingGame;

public class Game {
    private final int TOTAL_ROUNDS = 10;
    private final int TOTAL_ROLLS = 21;

    int round = 0;
    int rolls[] = new int[TOTAL_ROLLS];

    public void roll(int pins) {
        rolls[round++] = pins;
    }

    public int getScore() {
        int score = 0;
        int roll = 0;
        int strikeScore = 10;

        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            if (isSpare(roll)) {
                score += normalScore(roll) + spareBonus(roll);
                roll += 2;
            } else if (isStrike(roll)) {
                score += strikeScore + strikeBonus(roll);
                roll += 1;
            } else {
                score += normalScore(roll);
                roll += 2;
            }
        }
        return score;
    }


    private int normalScore(int roll) {
        return rolls[roll] + rolls[roll + 1];
    }

    private int spareBonus(int roll) {
        return rolls[roll + 2];
    }

    private int strikeBonus(int roll) {
        return rolls[roll + 1] + rolls[roll + 2];
    }

    private boolean isSpare(int roll) {
        return normalScore(roll) == 10;
    }

    private boolean isStrike(int roll) {
        return rolls[roll] == 10;
    }

}
