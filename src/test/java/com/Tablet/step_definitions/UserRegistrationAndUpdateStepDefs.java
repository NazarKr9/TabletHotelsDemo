package com.Tablet.step_definitions;

import com.Tablet.pages.AccountPage;
import com.Tablet.pages.TabletHomePage;
import com.Tablet.utilities.BrowserUtils;
import com.Tablet.utilities.ConfigurationReader;
import com.Tablet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class UserRegistrationAndUpdateStepDefs {


    String formattedEmail;

    TabletHomePage tabletHomePage = new TabletHomePage();
    AccountPage accountPage = new AccountPage();


    @Given("user is on the Tablet home page")
    public void user_is_on_the_tablet_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("tabletUrl"));
    }
    @When("user selects {string} from the homepage header navigation menu")
    public void user_selects_from_the_homepage_header_navigation_menu(String registration) {
        tabletHomePage.mainMenu.click();
        tabletHomePage.registerButton.click();


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

        tabletHomePage.firstName.sendKeys(ConfigurationReader.getProperty("firstName"));
        tabletHomePage.lastName.sendKeys(ConfigurationReader.getProperty("lastName"));
        tabletHomePage.submitButton.click();
        tabletHomePage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);
        System.out.println("formattedEmail = " + formattedEmail);

        /*
        @When("user fills out the registration form with valid email, first, last name, and password")
    public void user_fills_out_the_registration_form_with_valid_email_first_lastname_and_password() throws InterruptedException {
        String email = ConfigurationReader.getProperty("email");
        String firstName = faker.firstName();
        String lastName = faker.lastName();
        String password = "Mypassword123!";

        UserRegistrationUtils.registerNewUser(email, firstName, lastName, password);
    }
         */
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


    @Then("user updates their bio with new information")
    public void user_updates_their_bio_with_new_information() {

    }
    @Then("user uploads a profile image")
    public void user_uploads_a_profile_image() {

    }
    @Then("the user signs out")
    public void the_user_signs_out() {

    }
    @Then("the user should be logged out and redirected to the homepage")
    public void the_user_should_be_logged_out_and_redirected_to_the_homepage() {
    }



}
