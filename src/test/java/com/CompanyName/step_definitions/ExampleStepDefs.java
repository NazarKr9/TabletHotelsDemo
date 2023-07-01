package com.CompanyName.step_definitions;

import com.CompanyName.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ExampleStepDefs {

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com");


    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Assert.assertEquals("Goolle",Driver.getDriver().getTitle());
    }





}
