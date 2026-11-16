package fr.isep.tp4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class RomanNumeralsSteps {
    private int number;
    private String result;

    @Given("the integer {int}")
    public void givenInteger(int number) {
        this.number = number;
    }

    @When("I convert it to a Roman numeral")
    public void convertNumber() {
        result = new RomanNumerals().convert(number);
    }

    @Then("the Roman numeral is {string}")
    public void checkRomanNumeral(String expected) {
        assertEquals("Unexpected Roman numeral for " + number, expected, result);
    }
}
