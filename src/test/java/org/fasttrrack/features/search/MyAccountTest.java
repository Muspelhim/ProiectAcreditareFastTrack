package org.fasttrrack.features.search;

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
}
