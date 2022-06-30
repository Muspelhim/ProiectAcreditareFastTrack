package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.bcel.generic.PUSH;
import org.junit.Assert;

import java.util.List;


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
    @FindBy (id = "content-html")
    private WebElementFacade productDescriptionText;
    @FindBy (css = ".wp-editor-area")
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
    @FindBy (css = ".product_title")
    private WebElementFacade addedProduct;
    @FindBy (id = "insert-media-button")
    private WebElementFacade mediaButton;
    @FindBy (css = "#__wp-uploader-id-3 .media-menu .media-menu-item:last-child")
    private WebElementFacade insertFromUrl;
    @FindBy (id = "embed-url-field")
    private WebElementFacade completeUrl;
    @FindBy (css = "#__wp-uploader-id-3 .media-toolbar-primary >button")
    private WebElementFacade insertMedia;
    @FindBy (css = ".thickbox")
    private WebElementFacade productImage;
    @FindBy (css = ".media-router .media-menu-item.active")
    private WebElementFacade mediaLibraryProduct;
    @FindBy (css = ".save-ready:nth-child(12)")
    private WebElementFacade hatPicture;
    @FindBy (css = ".button.media-button.button-primary.button-large.media-button-select")
    private WebElementFacade insertProductImage;
    @FindBy (css = "p#set-post-thumbnail-desc")
    private WebElementFacade productIMageAdded;
    @FindBy (id = "product_cat-add-toggle")
    private WebElementFacade addNewCategory;
    @FindBy (css = "input#newproduct_cat")
    private WebElementFacade completeNewCategory;
    @FindBy (id = "product_cat-add-submit")
    private WebElementFacade addCategoryButton;
    @FindBy (id = "newproduct_cat_parent")
    private WebElementFacade categorySelectForNewProduct;
    @FindBy (id = "in-product_cat-36")
    private WebElementFacade hatCategory;
    @FindBy (css = "#toplevel_page_woocommerce >a")
    private WebElementFacade wooCommerce;
    @FindBy (css = "#toplevel_page_woocommerce .wp-first-item a")
    private WebElementFacade wooCommerceOrders;

    public void goOnOrders(){
        withAction().moveToElement(wooCommerce).build();
        withAction().moveToElement(wooCommerceOrders).click().build();
//        withAction().click(wooCommerce).moveToElement(wooCommerceOrders).build();
    }
    public void clickWooCommerce(){
        wooCommerce.click();
    }



    public void completeUserAdmin(){
        typeInto(userAdmin,"admin");
    }
    public void completePasswordAdmin(){
        typeInto(passwordAdmin,"parola11");
    }
    public void clickLoginAdmin(){
        clickOn(loginAdmin);
    }
    public void adminLogin(){
        completeUserAdmin();
        completePasswordAdmin();
        clickLoginAdmin();
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

    public void enterProductName(String product){

        typeInto(typeProductName , product);
    }
    public void clickProductText(){
        clickOn(productDescriptionText);
    }
    public void setProductDescription(String description){
        typeInto(insertProductDescription , description);
    }
    public void pressUncategorizedProduct(){
        uncategorizedProduct.click();
    }
    public void setProductTags(){
        typeInto(productTag, "produs nou");
    }
    public void setProductPrice(String price){
        typeInto(setProductStartingPrice, price);
    }
    public void setProductSalePrice(String salePrice){
    typeInto(setSalePriceForProduct , salePrice);
    }
    public void clickMediaButton(){
        mediaButton.click();
    }
    public void clickInsertFromUrl(){
        insertFromUrl.click();
    }
    public void completeTheUrl(){
        typeInto(completeUrl,"https://www.screencast.com/t/ghZX3DvelSJh");
        waitABit(3000);
    }
    public void clickInsertMedia(){
        insertMedia.click();
        waitABit(3000);
    }
    public void addMedia(){
        clickMediaButton();
        clickInsertFromUrl();
        completeTheUrl();
        clickInsertMedia();
    }
    public void clickProductImage(){
        productImage.click();
    }
    public void clickMediaLibraryProduct(){
        mediaLibraryProduct.click();
    }
    public void clickOnHatPicture(){
        hatPicture.click();
    }
    public void clickInsertProductImage(){
        insertProductImage.click();
    }
    public void verifyProductImage(){
        Assert.assertTrue(productIMageAdded.containsOnlyText("Click the image to edit or update"));
    }
    public void addProductImage(){
        clickProductImage();
        clickMediaLibraryProduct();
        clickOnHatPicture();
        clickInsertProductImage();
        waitABit(3000);
        verifyProductImage();
    }
    public void clickAddCategory(){
        addNewCategory.click();
    }
    public void completeNewCategory(){
        typeInto(completeNewCategory,"Hat");
    }
    public void selectTheCategory(){
        selectFromDropdown(categorySelectForNewProduct,"Clothing");
    }
    public void finalClickOnNewCategory(){
        addCategoryButton.click();
    }
    public void addNewHatCategory(){
        clickAddCategory();
        completeNewCategory();
        selectTheCategory();
        finalClickOnNewCategory();
    }
    public void clickHatCategory(){
        hatCategory.click();
    }


    public void pressPublishButton(){
        publishButton.click();
    }
    public void pressViewProductButton(){
        viewProduct.click();
    }
    public void addedProductAdmin(){
        Assert.assertTrue(addedProduct.containsOnlyText("Cel mai fain produs"));
    }


    public void addedNewHat(){

        Assert.assertTrue(addedProduct.containsOnlyText("White Hat"));

    }

}
