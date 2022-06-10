package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;

public class HomePageSteps extends ScenarioSteps {
    private HomePage homePage;

    @Step
    public void openHomePage(){
        homePage.open();
    }
    @Step
    public void clickOnMyAccount(){
        homePage.clickOnMyAccount();
    }
    @Step
    public void clickOnCheckout(){
        homePage.clickOnCheckout();

    }
    @Step
    public void clickOnCart(){
        homePage.clickOnCart();
    }
    @Step
    public void clickOnShop(){
        homePage.clickOnShop();
    }
    @Step
    public void clickOnLoggIn(){
        homePage.clickLoggIN();
    }
}
