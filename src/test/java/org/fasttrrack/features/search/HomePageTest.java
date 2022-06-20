package org.fasttrrack.features.search;

import org.fasttrrack.pages.HomePage;
import org.junit.Test;

public class HomePageTest extends BaseTest{
    private HomePage homePage;

    @Test
    public void verifyHomePageTitlePresence(){
        homePage.open();
        homePageSteps.verifyHomePageTitle();
    }


}
