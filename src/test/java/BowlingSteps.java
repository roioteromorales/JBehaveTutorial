import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by BlueRoi on 30-Sep-14.
 */
public class BowlingSteps {
    Game g;

    @Given("a game")
    public void givenAGame() {
        g = new Game();
    }

    @When("i roll <pins> pin")
    public void whenIRoll1Pin(@Named("pins") int pins) {
        g.roll(pins);
    }

    @Then("the score should be <score>")
    public void thenScoreShouldBe1(@Named("score") int score) {
        assertEquals(score, g.getScore());
    }


}
