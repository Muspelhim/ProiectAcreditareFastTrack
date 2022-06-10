package org.fasttrrack.features.search;


import org.fasttrrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loggIn(){
        myAccountSteps.doLogIn(Constants.USER_EMAIL,Constants.USER_PASSWORD);
    }
}
