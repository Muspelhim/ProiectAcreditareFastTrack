package org.fasttrrack.features.search;

import org.junit.Test;

public class ProductTest extends BaseTest{


    @Test
    public void leaveAReview(){
        searchSteps.searchFromTop("Hoodie");
        searchSteps.clickOnProduct("Hoodie with Logo");
        productSteps.completeReview();
    }

    @Test
    public void reviewWithNoStars(){
        searchSteps.searchFromTop("Hoodie");
        searchSteps.clickOnProduct("Hoodie");
        productSteps.selectColor();
        productSteps.selectOfLogo();
        productSteps.clickOnReviewTab();
        productSteps.completeTheReview();
        productSteps.completePersonName();
        productSteps.completeEmailReview();
        productSteps.clickSubmitReviewWithNoStar();
        productSteps.reviewsStar();
        productSteps.clickOnSubmitReview();
    }
}
