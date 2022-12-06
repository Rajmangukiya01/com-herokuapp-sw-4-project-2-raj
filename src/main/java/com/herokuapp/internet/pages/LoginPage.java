package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//i[contains(@class,'fa fa-2x')]");
    By secureAreaText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By invalidUsername = By.xpath("//div[@class='flash error']");
    By invalidPassword = By.id("flash");

    public void enterUsername(String text) {
        sendTextToElements(username, text);
    }

    public void enterPassword(String text) {
        sendTextToElements(password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSecureAreaText() {
        return getTextFromElement(secureAreaText);
    }

    public String getInvalidUsernameText() {
        return getTextFromElement(invalidUsername);
    }

    public String getInvalidPasswordText() {
        return getTextFromElement(invalidPassword);
    }
}

