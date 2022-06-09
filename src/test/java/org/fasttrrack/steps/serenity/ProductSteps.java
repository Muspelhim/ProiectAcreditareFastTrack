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
    public void addToCartProductFromProductPage() {
        homePage.open();
        homePage.clickOnShop();
        shopPage.selectHowToOrderProducts();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
    }
    @Step
    public void verifyIfProductAddedToCart(){
        productPage.productAddedToCartMessage();
    }
}
