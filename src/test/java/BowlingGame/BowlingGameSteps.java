package BowlingGame;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

public class BowlingGameSteps {

    private Game g;

    @Given("a game")
    public void givenAGame() {
        g = new Game();
    }

    @When("i roll $pins pin")
    public void whenIRollXPin(@Named("pins") int pins) {
        g.roll(pins);
    }

    @When("i roll spare")
    public void whenIRollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @When("i roll strike")
    public void whenIRollSrike() {
        g.roll(10);
    }

    @When("i roll all strikes")
    public void whenIRollAllSrike() {
        for (int i = 0; i < 12; i++) {
            g.roll(10);
        }
    }

    @Then("the score should be $score")
    public void thenScoreShouldBeX(@Named("score") int score) {
        assertEquals(score, g.getScore());
    }
}
