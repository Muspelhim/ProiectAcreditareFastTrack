package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.*;
import org.fasttrrack.utils.Constants;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private CartPage cartPage;
    private ShopPage shopPage;
    private ProductPage productPage;
    private SearchResultPage searchResultPage;
    private CheckoutPage checkoutPage;
    private MyAccountPage myAccountPage;

    @Step
    public void verifyEmptyCheckoutMessage() {
        homePage.open();
        homePage.clickOnCart();
        cartPage.verifyEmptyCart();
    }

    @Step
    public void verifyIfCouponApplied() {
        homePage.openShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        cartPage.addDiscount();
        cartPage.verifyCouponMessage();

    }

    @Step
    public void verifyIfCouponIsRemoved() {
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
    public void addToCartHoodie(String productName) {
        homePage.openSearch();
        homePage.searchFromTop(productName);
        homePage.clickOnSearchFromTop();
        searchResultPage.selectItemFromList(productName);
        productPage.clickOnAddToCartFromProduct();

    }

    @Step
    public void subtotalPriceCorect() {
        cartPage.isSubtotalPriceCorrect();
    }

    @Step
    public void getSubtotalPrice() {
        cartPage.getSubtotalPricesCalculated();
    }

    @Step
    public void verifyCartPageNotLoggedIn() {
        homePage.open();
        homePage.clickOnCart();
        cartPage.verifyCartNotLoggedIn();
    }

    @Step
    public void verifyCartPageLoggedIn() {
        homePage.open();
        homePage.clickOnMyAccount();
        myAccountPage.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        homePage.clickOnCart();
        cartPage.verifyCartLoggedIn();

    }

    @Step
    public void comparePrices() {
//        cartPage.getIntFromPrice("lei6.00" , "lei924.00");

    }
}
