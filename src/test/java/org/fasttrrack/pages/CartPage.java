package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy (css = ".cart-empty")
    private WebElementFacade emptyCart;

    public void verifyEmptyCart(){
        emptyCart.shouldContainOnlyText("Your cart is currently empty.");
    }
}