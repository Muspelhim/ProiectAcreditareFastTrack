package org.fasttrrack.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.Objects;

public class ProductPage extends PageObject {
    @FindBy (css = ".single_add_to_cart_button")
    private WebElementFacade addToCartFromProduct;
    @FindBy (css = "h1.product_title")
    private WebElementFacade productTitle;
    @FindBy (css = ".woocommerce-message:not(a)")
    private WebElementFacade productAddMessage;


    public void productAddedToCartMessage(){
        String product =productTitle.getTextContent();
        productAddMessage.shouldContainOnlyText("“"+product+"” has been added to your cart.");
    }

    public void clickOnAddToCartFromProduct(){
        clickOn(addToCartFromProduct);
    }
}
