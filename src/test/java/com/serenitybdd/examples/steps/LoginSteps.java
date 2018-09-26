package com.serenitybdd.examples.steps;

import com.serenitybdd.examples.screens.ApplicationHomePage;
import com.serenitybdd.examples.screens.LoginScreen;
import com.serenitybdd.examples.screens.UserAccountPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    private String actor;

    private ApplicationHomePage applicationHomePage;

    private LoginScreen loginScreen;

    private UserAccountPage userAccountPage;


    @Step("#actor is a registered member")
    public void IsARegisteredMember(){
        applicationHomePage.openAt();
        // we can check credentials using api or db
    }

    @Step("#actor should be able to sign in with their account")
    public void signInWithTheirAccount(String userName, String password){
        applicationHomePage.goToLoginScreen();
        loginScreen.login(userName, password);
    }

    @Step("#actor should be able to view their profile")
    public void checkProfile(){
        userAccountPage.checkTitle();
    }
}

