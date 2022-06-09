package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.CartPage;
import org.fasttrrack.pages.HomePage;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private CartPage cartPage;
    @Step
    public void verifyEmptyCheckoutMessage(){
        homePage.open();
        homePage.clickOnCart();
        cartPage.verifyEmptyCart();
    }
}
