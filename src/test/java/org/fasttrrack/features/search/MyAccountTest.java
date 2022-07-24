package org.fasttrrack.features.search;

import org.fasttrrack.utils.Constants;
import org.junit.Test;

public class MyAccountTest extends BaseTest{

    @Test
    public void verifyMyAccountPageTitle(){
        myAccountSteps.verifyMessage();
    }

    @Test
    public void loginUsingWrongEmail(){
      myAccountSteps.verifyWrongEmailInsertedError();
    }

    @Test
    public void verifyLoginUsingBadEmailFormat(){
        myAccountSteps.loginUsingBadEmailFormat();
    }

    @Test
    public void verifyLoginUsingWrongPasswordTest(){
        myAccountSteps.loginUsingWrongPassword();
    }

    @Test
    public void loginWithNoCredentials(){
        myAccountSteps.loginUsingNoCredentials();
    }

    @Test
    public void verifyCartAfterLogout(){
        homePageSteps.openHomePage();
        loginSteps.doLogIn(Constants.ROBERT_EMAIL, Constants.ROBERT_PASSWORD);
        homePageSteps.clickOnCart();
        myAccountSteps.doLogout();
        homePageSteps.clickOnCart();
        cartSteps.verifyCartPageNotLoggedIn();
    }

    @Test
    public void logout(){
        homePageSteps.openHomePage();
        loginSteps.navigateToLogIn();
        loginSteps.doLogIn(Constants.ROBERT_EMAIL, Constants.ROBERT_PASSWORD);
        myAccountSteps.doLogout();
    }
}
