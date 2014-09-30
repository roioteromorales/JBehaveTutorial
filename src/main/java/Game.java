/**
 * Created by BlueRoi on 30-Sep-14.
 */
public class Game {
    int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int getScore() {
        return score;
    }
}
