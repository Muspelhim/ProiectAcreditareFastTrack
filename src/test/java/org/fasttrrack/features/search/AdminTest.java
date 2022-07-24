package org.fasttrrack.features.search;

import org.junit.Before;
import org.junit.Test;


public class AdminTest extends BaseTest {


  @Test
    public void loginAsAdmin(){
      adminSteps.doAdminLogin();
  }

  @Test
  public void verifyAdminLoggedIn(){
    adminSteps.doAdminLogin();
    adminSteps.verifyAdminPage();
  }

  @Test
  public void addNewProductTest(){
    adminSteps.addNewProductAsAdmin();
  }

  @Test
  public void newHat(){
    adminSteps.addNewWhiteHat();
  }

  @Test
  public void goToWooCommerceOrders(){
    adminSteps.goToOrders();
  }

  @Test
  public void processingOrder(){
    checkoutSteps.doCompleteCheckoutNotLoggedIn();
  }

  @Test
  public void userOrder(){
    adminSteps.selectUserOrder();
  }

  @Test
  public void completeTheReview(){
    searchSteps.searchFromTop("Hoodie");
    searchSteps.clickOnProduct("Hoodie with Logo");
    productSteps.completeReview();
    closeDriver();
    adminSteps.doAdminLogin();
    adminSteps.accessTheComments();
    adminSteps.approveTheComment();
  }


}

