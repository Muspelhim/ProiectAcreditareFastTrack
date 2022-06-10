package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.*;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private CartPage cartPage;
    private ShopPage shopPage;
    private ProductPage productPage;
    private SearchResultPage searchResultPage;
    @Step
    public void verifyEmptyCheckoutMessage(){
        homePage.open();
        homePage.clickOnCart();
        cartPage.verifyEmptyCart();
    }

    @Step
    public void verifyIfCouponApplied(){
        homePage.openShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        cartPage.completeCouponField();
        cartPage.clickApplyCouponButton();
        cartPage.verifyCouponMessage();

    }
    @Step
    public void addToCartHoodie(String productName){
        homePage.openSearch();
        homePage.searchFromTop(productName);
        searchResultPage.selectItemFromList(productName);

    }

}
