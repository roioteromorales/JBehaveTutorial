package StringCalculator;

import org.jbehave.core.annotations.*;

import static junit.framework.TestCase.assertEquals;

public class CalculatorSteps {
    Calculator c;

    @Given("a calculator")
    public void givenACalculator() {
        c = new Calculator();
    }

    @When("introduce <number>")
    public void setNumber(@Named("number") int number) {
        c.set(number);
    }

    @When("overwrite with <number2>")
    public void setNumber2(@Named("number2") int number2) {
        c.set(number2);
    }

    @When("add <sum>")
    public void addsNumber(@Named("sum") int sum) {
        c.add(sum);
    }

    @When("sustract <sustraction>")
    public void substractNumber(@Named("sustraction") int sustraction) {
        c.substract(sustraction);
    }

    @Then("it displays $result")
    public void giveResult(@Named("result") int result) {
        assertEquals(result, c.getResult());
    }
}
