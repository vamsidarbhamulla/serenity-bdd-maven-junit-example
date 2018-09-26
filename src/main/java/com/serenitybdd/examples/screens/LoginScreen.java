package com.serenitybdd.examples.screens;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends PageObject {

    @FindBy(css="#login-form > section > div:nth-child(2) > div.col-md-6 > input")
    private static WebElementFacade FILL_USERNAME;

    @FindBy(css="#login-form > section > div:nth-child(3) > div.col-md-6 > div > input")
    private static WebElementFacade FILL_PASSWORD;

    @FindBy(css="#submit-login")
    private static WebElementFacade SIGN_IN;

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    private void fillUserName(String userName){
        FILL_USERNAME.clear();
        FILL_USERNAME.sendKeys(userName);
    }

    private void fillPassword(String password){
        FILL_PASSWORD.clear();
        FILL_PASSWORD.sendKeys(password);
    }


    private void clickSignIn() {
        SIGN_IN.click();
    }

    public void login(String userName, String password){
        fillUserName(userName);
        fillPassword(password);
        clickSignIn();
    }
}
