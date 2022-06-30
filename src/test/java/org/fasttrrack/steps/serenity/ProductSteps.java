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
    public void completeEmailReview(){
        productPage.emailOfReviews();
    }
    @Step
    public void completeTheReview(){
        productPage.reviewsMessage();
    }
    @Step
    public void completePersonName(){
        productPage.nameOfReviews();
    }
    @Step
    public void reviewsStar(){
        productPage.reviewStar();
    }
    @Step
    public void clickOnReviewTab(){
        productPage.reviewsTab();
    }
    @Step
    public void clickOnSubmitReview(){
        productPage.clickSubmitReview();
    }
    @Step
    public void addAReview(){
        productPage.reviewsTab();
        productPage.reviewStar();
        productPage.reviewsMessage();
    }
    @Step
    public void completeReview(){
        addAReview();
        productPage.nameOfReviews();
        productPage.emailOfReviews();
        productPage.clickSubmitReview();
        productPage.reviewSuccessMessage();
    }

    @Step
    public void clickSubmitReviewWithNoStar(){
        productPage.submitReviewWithNoStar();
    }
    @Step
    public void clickAddToCartFromProduct(){
        productPage.clickOnAddToCartFromProduct();
    }
    @Step
    public void selectColorAndLogo(){
        productPage.selectHoodieColor();
        productPage.selectLogo();
    }
    @Step
    public void selectColor(){
        productPage.selectHoodieColor();
    }
    @Step
    public void selectOfLogo(){
        productPage.selectLogo();
    }
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
        productPage.clickOnAddToCartFromProduct();
        productPage.verifyChangeQuantity();
    }
    @Step
    public void verifyIfProductAddedToCart(){
        productPage.productAddedToCartMessage();
    }
}
