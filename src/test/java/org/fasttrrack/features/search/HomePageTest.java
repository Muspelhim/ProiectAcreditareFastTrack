package org.fasttrrack.features.search;

import org.fasttrrack.pages.HomePage;
import org.junit.Test;

public class HomePageTest extends BaseTest{
    private HomePage homePage;

    @Test
    public void verifyHomePageTitlePresence(){
        homePage.open();
        homePageSteps.verifyHomepage();
    }

    @Test
    public void verifyReadMorePage(){
        homePage.open();
        homePage.clickReadMoreButton();
        homePage.verifyReadMore();
    }

    @Test
    public void verifyUncategorizedPageTitle(){
        homePageSteps.verifyUncategorizedPageButton();
    }

    @Test
    public void verifyArchivesPageTitleIsCorrect(){
        homePageSteps.verifyArchivesPageTitle();
    }

    @Test
    public void verifySearchButton(){
        homePageSteps.goToSearch();
    }

    @Test
    public void verifySearchFromRight(){
        homePageSteps.verifySearchFromTheRight();
    }

    @Test
    public void goToHomepage(){
        homePageSteps.openHomePage();
    }

    @Test
    public void goToMyAccount(){
        homePageSteps.openHomePage();
        homePageSteps.clickOnMyAccount();
    }

    @Test
    public void goToCheckout(){
        homePageSteps.openHomePage();
        homePageSteps.clickOnCheckout();
    }

    @Test
    public void goToShop(){
        homePageSteps.openHomePage();
        homePageSteps.clickOnShop();
    }

    @Test
    public void goToCart(){
        homePageSteps.openHomePage();
        homePageSteps.clickOnCart();
    }

}
