package org.fasttrrack.features.search;


import org.fasttrrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loggIn(){
        loginSteps.doLogIn(Constants.USER_EMAIL,Constants.USER_PASSWORD);
    }

    @Test
    public void verifyErrorMessageWhileUsingBadEmailFormat(){
        myAccountSteps.loginUsingBadEmailFormat();
    }

    @Test
    public void doLoginWithNoCredentials(){
        loginSteps.noCredentialsLoggIN();
    }

}
