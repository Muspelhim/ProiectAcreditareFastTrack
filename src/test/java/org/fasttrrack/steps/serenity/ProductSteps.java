package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.ProductPage;
import org.fasttrrack.pages.ShopPage;

public class ProductSteps extends ScenarioSteps {
    private HomePage homePage;
    private ProductPage productPage;
    private ShopPage shopPage;





    @Step
    public void clickAddToCartFromProduct(){
        productPage.clickOnAddToCartFromProduct();
    }
    @Step
    public void selectColorAndLogo(){
        productPage.selectHoodieColor();
        productPage.selectLogo();
    }
//    @Step
//    public void selectColor(){
//        productPage.selectHoodieColor();
//    }
//    @Step
//    public void selectLogo(){
//        productPage.selectLogo();
//    }
    @Step
    public void addToCartProductFromProductPage() {
        homePage.open();
        homePage.clickOnShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
    }
    @Step
    public void changeQuantityProduct(){
        productPage.changeQuantity();
        productPage.verifyChangeQuantity();
    }
    @Step
    public void verifyIfProductAddedToCart(){
        productPage.productAddedToCartMessage();
    }
}
