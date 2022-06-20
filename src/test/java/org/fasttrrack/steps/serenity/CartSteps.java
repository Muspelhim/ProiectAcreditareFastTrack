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
    private CheckoutPage checkoutPage;
    private MyAccountPage myAccountPage;
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
        cartPage.addDiscount();
        cartPage.verifyCouponMessage();

    }
    @Step
    public void verifyIfCouponIsRemoved(){
        homePage.openShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        cartPage.completeCouponField();
        cartPage.clickApplyCouponButton();
        homePage.clickOnCheckout();
        checkoutPage.clickOnRemoveCouponButton();
        checkoutPage.verifyCouponRemoveMessage();
    }
    @Step
    public void addToCartHoodie(String productName){
        homePage.openSearch();
        homePage.searchFromTop(productName);
        searchResultPage.selectItemFromList(productName);

    }
    @Step
    public void subtotalPriceCorect(){
        cartPage.isSubtotalPriceCorrect();
    }
    @Step
    public void getSubtotalPrice(){
        cartPage.getSubtotalPricesCalculated();
    }
    @Step
    public void verifyCartPageNotLoggedIn(){
        homePage.open();
        homePage.clickOnCart();
        cartPage.verifyCartNotLoggedIn();
    }
    @Step
    public void verifyCartPageLoggedIn(){
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.doLogin("robertcsete1@gmail.com" , "!Q2w3e4r5t6y");
        homePage.clickOnCart();
        cartPage.verifyCartLoggedIn();

    }

}
