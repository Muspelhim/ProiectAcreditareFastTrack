package org.fasttrrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class AdminTest extends BaseTest {
  @Test
    public void loginAsAdmin(){
      adminSteps.loginAdmin();
  }
}
