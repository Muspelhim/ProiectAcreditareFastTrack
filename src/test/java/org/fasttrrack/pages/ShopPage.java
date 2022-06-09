package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ShopPage extends PageObject {
    @FindBy (css = ".accesspress-breadcrumb span")
    private WebElementFacade shopMessage;
    @FindBy (css = ".orderby")
    private WebElementFacade orderProductsDropdown;
    @FindBy (css = ".columns-4 li:first-child")
    private WebElementFacade firstProduct;

    public void selectFirstProduct(){
        clickOn(firstProduct);
    }

    public void selectHowToOrderProducts(){
        selectFromDropdown(orderProductsDropdown,"Sort by price: high to low");
    }

    public void verifyShop(){
        shopMessage.shouldContainOnlyText("Shop");
    }
}
