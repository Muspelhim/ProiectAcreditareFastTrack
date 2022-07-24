package org.fasttrrack.features.search;


import org.fasttrrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loggIn(){
        loginSteps.doLogIn(Constants.ROBERT_EMAIL,Constants.ROBERT_PASSWORD);
    }
    @Test
    public void loggIn2(){
        loginSteps.doLogIn("trebuie sa scrii emailul tau","si parola ta");
    }

    @Test
    public void verifyErrorMessageWhileUsingBadEmailFormat(){
        myAccountSteps.loginUsingBadEmailFormat();
    }

    @Test
    public void doLoginWithNoCredentials(){
        loginSteps.noCredentialsLoggIN();
    }

    @Test
    public void loginWithOneLetterAndOneNumber(){
        loginSteps.doLogIn(Constants.ONE_LETTER , Constants.ONE_NUMBER);
    }

    @Test
    public void loginUsingOnlyLetters(){
        loginSteps.doLogIn("abcdefghijkl@email.com" , "mnopqrstuvxz");
    }

    @Test
    public void loginUsingOnlyNumbers(){
        loginSteps.doLogIn("12345@email.com" , "67890");
    }
}
