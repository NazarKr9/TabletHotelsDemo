package com.Tablet.utilities;

import com.Tablet.pages.TabletHomePage;
import org.openqa.selenium.Keys;

public class UserRegistrationUtils {

    private static TabletHomePage tabletHomePage = new TabletHomePage();

    public static void registerNewUser(String email, String firstName, String lastName, String password) throws InterruptedException {
        tabletHomePage.mainMenu.click();
        tabletHomePage.registerButton.click();

        String formattedEmail = BrowserUtils.generateFormattedEmail(email);
        tabletHomePage.enterEmailInputBox.sendKeys(formattedEmail);
        tabletHomePage.submitButton.click();
        Thread.sleep(2000);

        tabletHomePage.firstName.sendKeys(firstName);
        tabletHomePage.lastName.sendKeys(lastName);
        tabletHomePage.passwordInput.sendKeys(password);
        Thread.sleep(2000);

        tabletHomePage.submitButton.click();
        Thread.sleep(2000);
    }

}

