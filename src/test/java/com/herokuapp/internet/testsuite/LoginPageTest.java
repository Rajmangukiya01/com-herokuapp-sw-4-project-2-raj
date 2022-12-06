package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedText, "Secure area text is not displayed");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getInvalidUsernameText(),expectedText,"Username error message is not displayed");
    }

    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedText="Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getInvalidPasswordText(),expectedText,"Password error message is not displayed");
    }
}
