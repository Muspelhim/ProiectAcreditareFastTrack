package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-admin/")
public class AdminPage extends PageObject {
    @FindBy (css = "#user_login")
    private WebElementFacade userAdmin;
    @FindBy (css = "#user_pass")
    private WebElementFacade passwordAdmin;
    @FindBy (id = "wp-submit")
    private WebElementFacade loginAdmin;
    @FindBy (css= "#wp-admin-bar-my-account>a")
    private WebElementFacade adminAccount;
    @FindBy (css = "#comment-733 > div > p.row-actions > span.approve > a")
    private WebElementFacade approveComment;
    @FindBy (css = "#comment-733 > div > blockquote > p")
    private WebElementFacade verifyComment;
    @FindBy (css = "#menu-posts-product > a > div.wp-menu-image.dashicons-before.dashicons-admin-post")
    private WebElementFacade pressProducts;
    @FindBy (css = "#wpbody-content > div.wrap > a:nth-child(2)")
    private WebElementFacade addNewProduct;
    @FindBy (css = "#title")
    private WebElementFacade typeProductName;
    @FindBy (css = "#tinymce")
    private WebElementFacade insertProductDescription;
    @FindBy (css = "#in-popular-product_cat-15")
    private WebElementFacade uncategorizedProduct;
    @FindBy (css = "#new-tag-product_tag")
    private WebElementFacade productTag;
    @FindBy (css = "#_regular_price")
    private WebElementFacade setProductStartingPrice;
    @FindBy (css = "#_sale_price")
    private WebElementFacade setSalePriceForProduct;
    @FindBy (css = "#publish")
    private WebElementFacade publishButton;
    @FindBy (css = "#message > p > a")
    private WebElementFacade viewProduct;


    public void completeUserAdmin(){
        typeInto(userAdmin,"admin");
    }
    public void completePasswordAdmin(){
        typeInto(passwordAdmin,"parola11");
    }
    public void clickLoginAdmin(){
        clickOn(loginAdmin);
    }
    public void verifyAdmin(){
        adminAccount.isDisabled();
    }
    public void pressProductsButton(){
        pressProducts.click();
    }
    public void pressAddNewProduct(){
        addNewProduct.click();
    }
    public void enterProductName(){
        typeInto(typeProductName , "Cel mai fain produs");
    }
    public void setProductDescription(){
        typeInto(insertProductDescription , "Ni cel mai fain produs pe care l-ai vazut vreodata!");
    }
    public void pressUncategorizedProduct(){
        uncategorizedProduct.click();
    }
    public void setProductTags(){
        typeInto(productTag, "produs nou");
    }
    public void setProductPrice(){
        typeInto(setProductStartingPrice, "230");
    }
    public void setProductSalePrice(){
    typeInto(setSalePriceForProduct , "150");
    }
    public void pressPublishButton(){
        publishButton.click();
    }
    public void pressViewProductButton(){
        viewProduct.click();
    }

}
