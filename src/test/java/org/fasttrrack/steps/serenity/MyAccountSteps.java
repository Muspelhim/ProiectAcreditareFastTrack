package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.MyAccountPage;

public class MyAccountSteps extends ScenarioSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;


    @Step
    public void verifyMessage(){
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.verifyMyAccountPage("My Account");
    }


    @Step
    public void loginUsingBadEmailFormat(){
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.doLogin("bustiucr@gmailcom" , "pasgagoagaw2");
        myAccountPage.verifyBadCredentialsError();
    }

    @Step
    public void verifyWrongEmailInsertedError(){
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.doLogin("rbustiuc@yahoo.com" , "password1");
        myAccountPage.verifyWrongErrorMessage();
    }

    @Step
    public void loginUsingWrongPassword(){
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.doLogin("bustiucr@gmail.com" , "parolarea");
        myAccountPage.verifyWrongPassError();
    }

    @Step
    public void loginUsingNoCredentials(){
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.doLogin("" , "");
        myAccountPage.noCredentialsLogIn();
    }




}
