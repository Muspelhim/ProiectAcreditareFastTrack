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


}