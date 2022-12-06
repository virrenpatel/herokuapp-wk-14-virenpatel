package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void  UserShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        Assert.assertEquals(loginPage.getTextSecureArea(),expectedText,"Secure Area");
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.invalidUsername("tomsmith1");
        loginPage.validPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton1();
        String expectedMessage = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedMessage,"Your username is invalid!\n" +
                "×");
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.validUsername("tomsmith");
        loginPage.invalidPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton2();
        String expectedMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getErrorMessageForInvalidPassword(),expectedMessage,"Your password is invalid!\n" +
                "×");

    }
}
