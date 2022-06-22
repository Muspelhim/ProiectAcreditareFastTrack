package org.fasttrrack.features.search;

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

//  La asta mai am de lucrat(nu gasesc ceva selectori)
  @Test
  public void addNewProductTest(){
    adminSteps.addNewProductAsAdmin();
  }

}

