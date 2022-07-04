package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.ShopPage;

public class ShopSteps extends ScenarioSteps {

    private HomePage homePage;
    private ShopPage shopPage;
    private CartSteps cartSteps;

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

    @Step
    public void openReviewProductPage(){
        shopPage.clickReviewButton();
    }

    @Step
    public void writeNewComment(){
        shopPage.writeComment();
    }

    @Step
    public void orderProductsAllOptions(){
        homePage.open();
        homePage.clickOnShop();
        shopPage.selectPopularity();
        waitABit(300);
        shopPage.selectAverageRating();
        waitABit(300);
        shopPage.selectLowToHigh();
        waitABit(300);
        shopPage.selectOrderHighToLow();
        waitABit(300);
        shopPage.selectNewness();
    }

    @Step
    public void selectCheapestAndExpensiveProducts(){
        homePage.open();
        homePage.clickOnShop();
        shopPage.selectLowToHigh();
        shopPage.openCheapestProduct();
        shopPage.addCheapestProductToCart();
        shopPage.goBackToShop();
        shopPage.selectOrderHighToLow();
        shopPage.openExpensiveProduct();
        shopPage.addExpensiveProductToCart();
        shopPage.pressCartButton();




    }
}
