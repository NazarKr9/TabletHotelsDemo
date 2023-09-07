package com.Tablet.pages;

import com.Tablet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabletHomePage {
    public TabletHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='QuickMenu__launch']")
    public WebElement mainMenu;

    @FindBy(xpath= "//span[text()='Register']")
    public WebElement registerButton;

    @FindBy(id = "RegisterEmailemail")
    public WebElement enterEmailInputBox;

    @FindBy(id = "RegisterNamesfirst_name")
    public WebElement firstName;

    @FindBy(id = "RegisterNameslast_name")
    public WebElement lastName;


    @FindBy(id = "RegisterPasswordpassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='RegisterModal__Title' and text()=\"You're in!\"]") //not a right locator
    public WebElement registerConfirmationMessage;

    @FindBy(xpath = "//a[@href='/account']")
    public WebElement myInfoMenu;






















}
