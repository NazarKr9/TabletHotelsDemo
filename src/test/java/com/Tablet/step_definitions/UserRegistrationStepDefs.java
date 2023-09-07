package com.Tablet.step_definitions;

import com.Tablet.pages.TabletHomePage;
import com.Tablet.utilities.BrowserUtils;
import com.Tablet.utilities.ConfigurationReader;
import com.Tablet.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;


public class UserRegistrationStepDefs {
    String formattedEmail;

    TabletHomePage tabletHomePage = new TabletHomePage();

/*
    @Given("user is on the Tablet home page")
    public void user_is_on_the_tablet_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("tabletUrl"));
    }
    @When("user selects {string} from the homepage header navigation menu")
    public void user_selects_from_the_homepage_header_navigation_menu(String registration)  {
     tabletHomePage.mainMenu.click();
     tabletHomePage.registerButton.click();
        System.out.println("testing steps");

    }
    @When("user fills out the registration form with valid email,first,last name and password")
    public void user_fills_out_the_registration_form_with_valid_email_first_lastname_and_password() throws InterruptedException {
        //generating email as per request using dynamic email from Config.properties and method created in BrowserUtils
        formattedEmail = BrowserUtils.generateFormattedEmail(ConfigurationReader.getProperty("email"));
        System.out.println("formattedEmail = " + formattedEmail);
        // in case I need to store this email for future login
        tabletHomePage.enterEmailInputBox.sendKeys(formattedEmail);
                                                    //BrowserUtils.generateFormattedEmail(email)
        tabletHomePage.submitButton.click();
        System.out.println("testing steps");

        //filling first and last name
        Thread.sleep(2000);
        //make this data dynamic later
        tabletHomePage.firstName.sendKeys("Nazar");
        tabletHomePage.lastName.sendKeys("Kravets");
        tabletHomePage.submitButton.click();
        tabletHomePage.passwordInput.sendKeys("Mypassword123!");
        Thread.sleep(2000);
        System.out.println("formattedEmail = " + formattedEmail);
    }




    @When("the user submits the registration form")
    public void the_user_submits_the_registration_form() throws InterruptedException {
        tabletHomePage.submitButton.click();
        Thread.sleep(2000);

    }
    @Then("the user should have a registered account")
    public void the_user_should_have_a_registered_account() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("You're in!", tabletHomePage.registerConfirmationMessage.getText());
        System.out.println("tabletHomePage.registerConfirmationMessage.getText() = " + tabletHomePage.registerConfirmationMessage.getText());
        //have to find right locator for confirmation mess
    }

 */




}
