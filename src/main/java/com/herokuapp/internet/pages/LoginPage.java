package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.tagName("i");
    By secureAreaText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By invalidUserNameField = By.name("password");
    By validPasswordField = By.name("password");
    By loginButton1 = By.tagName("i");
    By yourUsernameIsInvalid = By.xpath("//div[@id='flash-messages']//div[1]");
    By validUserNameField = By.name("username");
    By invalidPasswordField = By.name("password");
    By loginButton2 = By.tagName("i");
    By yourPasswordIsInvalid = By.xpath("//div[@id='flash-messages']//div[1]");

    public void enterUsername(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getTextSecureArea() {
        return getTextFromElement(secureAreaText);
    }

    public void invalidUsername(String userName) {
        sendTextToElement(invalidUserNameField, userName);
    }

    public void validPassword(String password) {
        sendTextToElement(validPasswordField, password);
    }

    public void clickOnLoginButton1() {
        clickOnElement(loginButton1);
    }

    public String getErrorMessage() {
        return getTextFromElement(yourUsernameIsInvalid);

    }

    public void validUsername(String userName) {
        sendTextToElement(validUserNameField, userName);
    }

    public void invalidPassword(String password) {
        sendTextToElement(invalidPasswordField, password);
    }

    public void clickOnLoginButton2() {
        clickOnElement(loginButton2);
    }

    public String getErrorMessageForInvalidPassword() {
        return getTextFromElement(yourPasswordIsInvalid);
    }
}




