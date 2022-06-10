package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy (css = ".cart-empty")
    private WebElementFacade emptyCart;
    @FindBy (css = "input#coupon_code")
    private WebElementFacade couponField;
    @FindBy (css = "input.button")
    private WebElementFacade applyCouponButton;
    @FindBy (css = " .cart-discount th")
    private WebElementFacade couponMessage;

    public void verifyCouponMessage(){
        couponMessage.shouldContainText("COUPON:");
    }
    public void clickApplyCouponButton(){
        clickOn(applyCouponButton);
    }
    public void completeCouponField(){
        typeInto(couponField,"percentage25");
    }



    public void verifyEmptyCart(){
        emptyCart.shouldContainOnlyText("Your cart is currently empty.");
    }
}