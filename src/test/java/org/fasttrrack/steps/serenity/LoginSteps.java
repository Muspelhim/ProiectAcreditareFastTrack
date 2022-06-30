package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.MyAccountPage;

public class LoginSteps extends ScenarioSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    @Step
    public void doLogIn(String email,String password){
        homePage.open();
        homePage.clickOnLoggIN();
        myAccountPage.completeEmailField(email);
        myAccountPage.completePasswordField(password);
        myAccountPage.clickLoginButton();
    }
    @Step
    public void navigateToLogIn(){
        homePage.open();
        homePage.clickOnLoggIN();
        myAccountPage.clickLoginButton();
    }
    @Step
    public void noCredentialsLoggIN(){
        navigateToLogIn();
        myAccountPage.noCredentialsLogIn();
    }

}
