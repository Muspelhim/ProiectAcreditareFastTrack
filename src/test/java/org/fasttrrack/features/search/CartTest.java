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

    @Test
    public void addToCartHoodie(){
        cartSteps.addToCartHoodie("Hoodie");
    }

    @Test
    public void verifyCartPageTitleNotLoggedIn(){
        cartSteps.verifyCartPageNotLoggedIn();
    }

    @Test
    public void verifyCartPageTitleLoggedIn(){
        cartSteps.verifyCartPageLoggedIn();
    }

    @Test
    public void verifyIfQuantityChanged(){
        cartSteps.addToCartHoodie("hoodie");
        productSteps.selectColor();
        productSteps.selectOfLogo();
        productSteps.clickAddToCartFromProduct();
        homePageSteps.goToCart();
        cartSteps.changeTheQuantityOfOneProduct();
        cartSteps.clickOnUpdateCart();
        cartSteps.verifyCartUpdateMessage();
    }
    @Test
    public void removeItem(){
        cartSteps.addToCartHoodie("Hoodie with Logo");
        homePageSteps.clickOnCart();
        cartSteps.removeAnItem();

    }
}