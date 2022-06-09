package org.fasttrrack.features.search;

import org.junit.Test;

public class CheckoutTest extends BaseTest{
    @Test
    public void verifyCheckoutMessageWithNoProduct(){
        homePageSteps.openHomePage();
        checkoutSteps.verifyCheckoutPageWithNoProducts();
    }
}
