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
    public void verifySearchFromTheRight(){
        openHomePage();
        homePage.clickOnSearchFromRight();
    }

    @Step
    public void goToSearch(){
        homePage.openSearch();
        homePage.verifyTheSearchPage();
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
        waitABit(500);
    }

    @Step
    public void clickOnMyAccount(){
        homePage.clickOnMyAccount();
        waitABit(500);
    }

    @Step
    public void clickOnCheckout(){
        homePage.clickOnCheckout();
        waitABit(500);
    }

    @Step
    public void clickOnCart(){
        homePage.clickOnCart();
        waitABit(500);
    }

    @Step
    public void clickOnShop(){
        homePage.clickOnShop();
        waitABit(500);
    }

    @Step
    public void clickOnLoggIn(){
        homePage.clickOnLoggIN();
        waitABit(500);
    }

    @Step
    public void verifyHomepage(){
        homePage.homePageVerification();
    }

    @Step
    public void verifyUncategorizedPageButton(){
        homePage.open();
        homePage.pressUncategorizedButton();
        homePage.verifyUncategorizedPage();
    }

    @Step
    public void verifyArchivesPageTitle(){
        homePage.open();
        homePage.verifyArchives();
        homePage.verifyArchivesPage();
    }
}
