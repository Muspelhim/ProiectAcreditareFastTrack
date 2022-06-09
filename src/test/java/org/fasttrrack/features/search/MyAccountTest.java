package org.fasttrrack.features.search;

import org.junit.Test;

public class MyAccountTest extends BaseTest{

    @Test
    public void verifyMyAccountMessageNotLoggedIn(){
        myAccountSteps.verifyMessage();
    }
}
