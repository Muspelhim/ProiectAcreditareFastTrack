package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.AdminPage;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.MyAccountPage;
import org.fasttrrack.pages.ShopPage;
import org.fasttrrack.utils.Constants;

public class AdminSteps extends ScenarioSteps {

    private AdminPage adminPage;
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private ShopPage shopPage;


    @Step
    public void doAdminLogin(){
        adminPage.open();
        adminPage.completeUserAdmin();
        adminPage.completePasswordAdmin();
        adminPage.clickLoginAdmin();
    }

    @Step
    public void verifyAdminPage(){
        adminPage.verifyAdmin();
    }

    @Step
    public void addNewProductAsAdmin(){
        doAdminLogin();
        adminPage.pressProductsButton();
        adminPage.pressAddNewProduct();
        adminPage.enterProductName("Cel mai fain produs");
        adminPage.clickProductText();
        adminPage.setProductDescription("Ni cel mai fain produs pe care l-ai vazut vreodata!");
        adminPage.pressUncategorizedProduct();
        adminPage.setProductTags();
        adminPage.setProductPrice("230");
        adminPage.setProductSalePrice("150");
        adminPage.pressPublishButton();
        adminPage.pressViewProductButton();
        adminPage.addedProductAdmin();
    }

    @Step
    public void addNewWhiteHat(){
        doAdminLogin();
        adminPage.pressProductsButton();
        adminPage.pressAddNewProduct();
        adminPage.enterProductName("White Hat");
        adminPage.clickProductText();
        adminPage.setProductDescription("This is the best new white hat");
        adminPage.clickHatCategory();
        adminPage.setProductTags();
        adminPage.setProductPrice("150");
        adminPage.setProductSalePrice("50");
        adminPage.addProductImage();
        adminPage.addMedia();
        adminPage.pressPublishButton();
        adminPage.pressViewProductButton();
        adminPage.addedNewHat();
    }

    @Step
    public void goToOrders(){
        adminPage.open();
        adminPage.adminLogin();
        adminPage.goOnOrders();
    }

    @Step
    public void clickOnWooCommerce(){
        adminPage.clickWooCommerce();
    }

    @Step
    public void selectUserOrder(){
        adminPage.open();
        adminPage.adminLogin();
        adminPage.clickWooCommerce();
        adminPage.selectUserOrder(Constants.USER_NAME);
    }

    @Step
    public void approveTheComment(){
        adminPage.selectUnapprovedComment();
        adminPage.selectActionFromDropdownComments();
        adminPage.applyTheCommentsAction();

    }

    @Step
    public void accessTheComments(){
        adminPage.accessComments();
    }
}
