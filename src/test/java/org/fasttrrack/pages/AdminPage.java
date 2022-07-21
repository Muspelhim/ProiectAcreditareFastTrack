package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.bcel.generic.PUSH;
import org.fasttrrack.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-admin/")
public class AdminPage extends PageObject {

    @FindBy (id = "user_login")
    private WebElementFacade userAdmin;

    @FindBy (id = "user_pass")
    private WebElementFacade passwordAdmin;

    @FindBy (id = "wp-submit")
    private WebElementFacade loginAdmin;

    @FindBy (css = "#wp-admin-bar-my-account>a")
    private WebElementFacade adminAccount;

    @FindBy (css = ".menu-icon-comments .wp-menu-name")
    private WebElementFacade goToComments;

    @FindBy (css = "#comment-733 > div > p.row-actions > span.approve > a")
    private WebElementFacade approveComment;

    @FindBy (css = "#comment-733 > div > blockquote > p")
    private WebElementFacade verifyComment;

    @FindBy(id = "the-comment-list")
    private List<WebElementFacade>commentList;

    @FindBy(css = "#the-comment-list .even:first-child .row-actions")
    private WebElementFacade firstComment;

    @FindBy (css = "#the-comment-list .even:first-child .row-actions .approve")
    private WebElementFacade approveCommentFromTheList;

    @FindBy (css = ".menu-icon-product .wp-menu-name")
//    #menu-posts-product > a > div.wp-menu-image.dashicons-before.dashicons-admin-post (acesta era inainte si l-am facut mai mic)
    private WebElementFacade pressProducts;

    @FindBy (css = "#wpbody-content > div.wrap > a:nth-child(2)")
    private WebElementFacade addNewProduct;

    @FindBy (id = "title")
    private WebElementFacade typeProductName;

    @FindBy (id = "content-html")
    private WebElementFacade productDescriptionText;

    @FindBy (css = ".wp-editor-area")
    private WebElementFacade insertProductDescription;

    @FindBy (id = "in-product_cat-15")
    private WebElementFacade uncategorizedProduct;

    @FindBy (id = "new-tag-product_tag")
    private WebElementFacade productTag;

    @FindBy (id = "_regular_price")
    private WebElementFacade setProductStartingPrice;

    @FindBy (id = "_sale_price")
    private WebElementFacade setSalePriceForProduct;

    @FindBy (id = "publish")
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

    @FindBy (css = ".column-order_number")
    private List<WebElementFacade> ordersList;

    @FindBy (css = ".column-order_number strong")
    private WebElementFacade userOrderName;


    public void accessComments(){
        goToComments.click();
    }
    public void goToFirstComment(){
        withAction().moveToElement(firstComment);

    }
    public void approveFromCommentsHover(){
        withAction().moveToElement(approveCommentFromTheList).click();

    }

    public void selectUserOrder(String userName){
        userName= Constants.USER_NAME;
        for (WebElementFacade element : ordersList) {
            if (userOrderName.getText().equalsIgnoreCase(userName)) {
                userOrderName.click();
                break;
            }
        }
    }

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

    public void commentsSection(){
        goToComments.click();
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
