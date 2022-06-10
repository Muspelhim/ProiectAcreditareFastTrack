package org.fasttrrack.features.search;

import org.junit.Test;

public class CheckoutTest extends BaseTest{
    @Test
    public void verifyCheckoutMessageWithNoProduct(){
        homePageSteps.openHomePage();
        checkoutSteps.verifyCheckoutPageWithNoProducts();
    }
    @Test
    public void checkoutNotLoggedIn(){
        checkoutSteps.proceedToCheckoutNotLoggedIn();
        checkoutSteps.doCheckOutNotLoggedIn();
    }
    @Test
    public void checkoutLoggedIn(){
        checkoutSteps.doCheckOutLoggedIn();
    }
}
