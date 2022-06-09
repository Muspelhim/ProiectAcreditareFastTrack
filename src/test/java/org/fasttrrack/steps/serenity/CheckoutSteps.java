package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.CartPage;
import org.fasttrrack.pages.CheckoutPage;
import org.fasttrrack.pages.HomePage;


public class CheckoutSteps extends ScenarioSteps {
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private CartPage cartPage;


    @Step
    public void verifyCheckoutPageWithNoProducts(){
        homePage.clickOnCheckout();
        cartPage.verifyEmptyCart();
    }
}
