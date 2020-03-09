package us.scottic.library.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
    @Given("When I want to checkout a book")
    public void whenIWantToCheckoutABook() {
    }

    @When("I checkout the book")
    public void iCheckoutTheBook() {
    }

    @Then("the book should be marked as checked out by me")
    public void theBookShouldBeMarkedAsCheckedOutByMe() {
    }

    @And("not be available for checkout by anyone else")
    public void notBeAvailableForCheckoutByAnyoneElse() {
    }
}
