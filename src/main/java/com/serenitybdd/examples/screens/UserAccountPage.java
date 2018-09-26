package com.serenitybdd.examples.screens;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class UserAccountPage extends PageObject {

    public void checkTitle(){
        Assert.assertEquals( getTitle(),"My account");
    }
}
