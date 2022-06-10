package org.fasttrrack.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;


public class ProductPage extends PageObject {
    String quantity= RandomStringUtils.randomNumeric(1);

    @FindBy (css = ".single_add_to_cart_button")
    private WebElementFacade addToCartFromProduct;
    @FindBy (css = "h1.product_title")
    private WebElementFacade productTitle;
    @FindBy (css = ".woocommerce-message:not(a)")
    private WebElementFacade productMessage;
    @FindBy (css = ".screen-reader-text")
    private WebElementFacade quantityProduct;
    @FindBy (css = "select#pa_color")
    private WebElementFacade hoodieColorDropdown;
    @FindBy (css = "select#logo")
    private WebElementFacade hoodieLogoDropdown;



    public void selectHoodieColor(){
        selectFromDropdown(hoodieColorDropdown,"Green");
    }
    public void selectLogo(){
        selectFromDropdown(hoodieLogoDropdown,"Yes");
    }
    public void verifyChangeQuantity(){
        String product =productTitle.getTextContent();
        productMessage.shouldContainText(quantity+"x“"+product+"” have been added to your cart.");
    }
    public void changeQuantity(){
        typeInto(quantityProduct,quantity);
    }
    public void productAddedToCartMessage(){
        String product =productTitle.getTextContent();
        productMessage.shouldContainText("“"+product+"” has been added to your cart.");
    }

    public void clickOnAddToCartFromProduct(){
        clickOn(addToCartFromProduct);
    }
}
