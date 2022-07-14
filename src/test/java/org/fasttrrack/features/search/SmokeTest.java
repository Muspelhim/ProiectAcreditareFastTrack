package org.fasttrrack.features.search;


import org.fasttrrack.pages.HomePage;
import org.junit.Test;

public class SmokeTest extends BaseTest {

    private HomePage homePage;


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

