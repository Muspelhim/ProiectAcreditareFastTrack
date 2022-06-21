package org.fasttrrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrrack.pages.AdminPage;
import org.fasttrrack.steps.serenity.*;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = true)
    public WebDriver webDriver;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected MyAccountSteps myAccountSteps;
    @Steps
    protected HomePageSteps homePageSteps;
    @Steps
    protected ShopSteps shopSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps
    protected AdminSteps adminSteps;


    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }
    @After
    public void closeDriver(){
        webDriver.close();
    }

}
