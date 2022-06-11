package org.fasttrrack.features.search;

import org.junit.Test;

public class CartTest extends  BaseTest{
    @Test
    public void verifyEmptyCart(){
      cartSteps.verifyEmptyCheckoutMessage();

    }


    @Test
    public void verifyCoupon(){
        cartSteps.verifyIfCouponApplied();
    }

    @Test
    public  void verifyRemoveCoupon(){
        cartSteps.verifyIfCouponIsRemoved();
    }
}