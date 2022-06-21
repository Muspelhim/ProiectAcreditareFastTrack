package org.fasttrrack.features.search;

import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void leaveAReview(){
        searchSteps.searchFromTop("Hoodie");
        searchSteps.clickOnProduct("Hoodie with Logo");
        productSteps.completeReview();
    }

}
