package org.fasttrrack.features.search;

import org.junit.Test;

public class ShopTest extends BaseTest{


    @Test
    public void verifyShopPage(){
        shopSteps.verifyShop();
    }

    @Test
    public void selectFirstProductFromShop(){
        shopSteps.navigateToShopPage();
        shopSteps.selectHighToLow();
        shopSteps.clickOnFirstProduct();
    }

    @Test
    public void addToCartFirstProduct(){
        productSteps.addToCartProductFromProductPage();
        productSteps.verifyIfProductAddedToCart();
    }

    @Test
    public void verifyIfQuantityChange(){
        shopSteps.navigateToShopPage();
        shopSteps.selectNewness();
        shopSteps.clickOnFirstProduct();
        productSteps.changeQuantityProduct();
    }

    @Test
    public void sortProducts(){
        shopSteps.orderProductsAllOptions();
    }
}
