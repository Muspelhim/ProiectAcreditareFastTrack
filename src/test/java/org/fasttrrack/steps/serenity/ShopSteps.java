package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.ShopPage;

public class ShopSteps extends ScenarioSteps {
    private HomePage homePage;
    private ShopPage shopPage;

    @Step
    public void navigateToShopPage(){
        homePage.open();
        homePage.clickOnShop();
    }
    @Step
    public void selectHighToLow(){
        shopPage.selectOrderHighToLow();
    }
    @Step
    public void clickOnFirstProduct(){
        shopPage.selectFirstProduct();
    }
    @Step
    public void selectNewness(){
        shopPage.selectNewness();
    }


    @Step
    public void verifyShop(){
        homePage.open();
        homePage.clickOnShop();
        shopPage.verifyShop();
    }
}
