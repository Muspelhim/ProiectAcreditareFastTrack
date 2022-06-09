package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckoutPage extends PageObject {
    @FindBy(css = ".woocommerce-info  ")
    private WebElementFacade checkoutMessage;

    public void verifyCheckoutMessage(){
        checkoutMessage.shouldContainOnlyText("Checkout is not available whilst your cart is empty.");
    }
}

