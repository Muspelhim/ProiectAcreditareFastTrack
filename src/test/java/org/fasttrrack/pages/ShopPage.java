package org.fasttrrack.pages;

import jnr.ffi.Struct;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.fasttrrack.steps.serenity.ShopSteps;

public class ShopPage extends BasePage {
    @FindBy (css = ".accesspress-breadcrumb span")
    private WebElementFacade shopMessage;

    @FindBy (css = ".orderby")
    private WebElementFacade orderProductsDropdown;

    @FindBy (css = ".columns-4 li:first-child")
    private WebElementFacade firstProduct;

    @FindBy (css = "#tab-title-reviews")
    private WebElementFacade reviewButton;

    @FindBy (css = "#comment")
    private WebElementFacade typeComment;

    @FindBy (css = "#submit")
    private WebElementFacade submitComment;

    @FindBy (css = ".star-1")
    private WebElementFacade reviewOneStar;

    @FindBy (css = ".description")
    private WebElementFacade verifyComment;

    @FindBy (css = "#primary > div > div.wc-products > ul > li.post-898.product.type-product.status-publish.product_cat-tshirts.instock.shipping-taxable.purchasable.product-type-simple > div.collection_combine > div > div > div > a > img")
    private WebElementFacade selectCheapestProduct;

    @FindBy (css = ".single_add_to_cart_button ")
    private WebElementFacade addCheapestProduct;

    @FindBy (css = "#menu-item-73 > a")
    private WebElementFacade clickOnShop;

    @FindBy (css = "#primary > div > div.wc-products > ul > li.post-912.product.type-product.status-publish.product_cat-tshirts.first.instock.shipping-taxable.purchasable.product-type-simple > div.collection_combine > div > div > div > a > img")
    private WebElementFacade selectExpensiveProduct;

    @FindBy (css = "#primary > div > div.wc-products > ul > li.post-912.product.type-product.status-publish.product_cat-tshirts.first.instock.shipping-taxable.purchasable.product-type-simple > div.collection_desc.clearfix > div > a")
    private WebElementFacade addExpensiveProduct;

    @FindBy (css = "#primary > div > div.wc-products > ul > li.post-912.product.type-product.status-publish.product_cat-tshirts.first.instock.shipping-taxable.purchasable.product-type-simple > div.collection_desc.clearfix > div > a")
    private WebElementFacade pressCart;

    public void selectFirstProduct(){
                clickOn(firstProduct);
    }
    public void selectNewness(){
        selectFromDropdown(orderProductsDropdown,"Sort by newness");
    }
    public void selectOrderHighToLow(){
        selectFromDropdown(orderProductsDropdown,"Sort by price: high to low");
    }
    public void selectPopularity(){
        selectFromDropdown(orderProductsDropdown , "Sort by popularity");
    }
    public void selectAverageRating(){
        selectFromDropdown(orderProductsDropdown , "Sort by average rating");
    }
    public void selectLowToHigh(){
        selectFromDropdown(orderProductsDropdown , "Sort by price: low to high");
    }
    public void verifyShop(){
        shopMessage.shouldContainOnlyText("Shop");
    }
    public void clickReviewButton(){
        clickOn(reviewButton);
    }
    public void writeComment(){
        typeInto(typeComment,"No bine!");
    }
    public void pressOneStarReview(){
        reviewOneStar.click();
    }
    public void submitComment(){
        submitComment.click();
    }
    public void verifyProductComment(){
        verifyComment.getText().equals("No bine!");
    }
    public void openCheapestProduct(){
        clickOn(selectCheapestProduct);
    }
    public void addCheapestProductToCart(){
        clickOn(addCheapestProduct);
    }
    public void goBackToShop(){
        clickOn(clickOnShop);
    }
    public void openExpensiveProduct(){
        clickOn(selectExpensiveProduct);
    }
    public void addExpensiveProductToCart(){
        clickOn(addExpensiveProduct);
    }
    public void pressCartButton(){
        clickOn(pressCart);
    }


    }


