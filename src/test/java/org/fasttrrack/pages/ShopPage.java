package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

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

    public void selectFirstProduct(){
        clickOn(firstProduct);
    }
    public void selectNewness(){
        selectFromDropdown(orderProductsDropdown,"Sort by newness");
    }
    public void selectOrderHighToLow(){
        selectFromDropdown(orderProductsDropdown,"Sort by price: high to low");
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

}
