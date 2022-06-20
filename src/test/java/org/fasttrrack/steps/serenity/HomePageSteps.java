package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;

public class HomePageSteps extends ScenarioSteps {
    private HomePage homePage;

    @Step
    public void goToMyAccount(){
        homePage.openMyAccount();
    }
    @Step
    public void goToCheckout(){
        homePage.openCheckout();
    }
    @Step
    public void goToCart(){
        homePage.openCart();
    }
    @Step
    public void goToShop(){
        homePage.openShop();
    }
    @Step
    public void goToSearch(){
        homePage.openSearch();
    }
    @Step
    public void goToLoggIn(){
        homePage.openLoggIn();
    }


    @Step
    public void searchFromTop(String keyword){
        homePage.searchFromTop(keyword);
    }

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
        homePage.clickOnLoggIN();
    }
    @Step
    public void verifyHomePageTitle(){
        homePage.verifyHomePage();
    }
}
