package com.Tablet.pages;

import com.Tablet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/account/yourinfo']")
    public WebElement myInfoPage;

    @FindBy(xpath = "//textarea[@placeholder='Add a brief bio']")
    public WebElement bioTextField;

    @FindBy (xpath = "//button[@class = 'Cropper__updatePhotoBtn'][1]")
    public WebElement uploadImageButton;

    @FindBy (xpath = "//button[@class = 'Button UpdateProfile__saveProfileBtn']")
    public WebElement saveProfileButton;

    @FindBy(xpath= "//span[text()='Sign Out']")
    public WebElement signOutButton;


}
