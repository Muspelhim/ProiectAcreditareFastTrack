package org.fasttrrack.features.search;

import org.junit.Assert;
import org.junit.Test;

public class ShopTest extends BaseTest{
    @Test
    public void verifyShopPage(){
        shopSteps.verifyShop();
    }
    @Test
    public void selectFirstProductFromShop(){
        shopSteps.navigateToShopPage();
        shopSteps.orderProducts();
        shopSteps.clickOnFirstProduct();
    }

    @Test
    public void addToCartFirstProduct(){
        productSteps.addToCartProductFromProductPage();
        productSteps.verifyIfProductAddedToCart();
    }
}
