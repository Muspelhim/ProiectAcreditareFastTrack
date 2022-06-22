package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.AdminPage;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.MyAccountPage;
import org.fasttrrack.pages.ShopPage;

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
        adminPage.open();
        adminPage.completeUserAdmin();
        adminPage.completePasswordAdmin();
        adminPage.clickLoginAdmin();
        adminPage.pressProductsButton();
        adminPage.pressAddNewProduct();
        adminPage.enterProductName();
        adminPage.setProductDescription();
        adminPage.pressUncategorizedProduct();
        adminPage.setProductTags();
        adminPage.setProductPrice();
        adminPage.setProductSalePrice();
        adminPage.pressPublishButton();
        adminPage.pressViewProductButton();
    }
}
