package org.fasttrrack.features.search;

import org.fasttrrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest{
    private String product = "Hoodie";


    @Test
    public void searchWith1Letter(){
        searchSteps.searchFromTop(Constants.SEARCH_LETTER);
        searchSteps.verifySearchMessage(Constants.SEARCH_LETTER);
    }

    @Test
    public void searchWith1Number(){
        searchSteps.searchFromTop(Constants.SEARCH_NUMBER);
        searchSteps.verifySearchMessage(Constants.SEARCH_NUMBER);
    }

    @Test
    public void clickOnItem(){
        searchSteps.searchFromTop(product);
        searchSteps.verifyProductInResults(product);
        searchSteps.clickOnProduct(product);
    }

    @Test
    public void addToCartNotLoggedIn(){
        searchSteps.searchFromTop(product);
        searchSteps.clickOnProduct(product);
        searchSteps.clickOnProduct(product);
        productSteps.selectColorAndLogo();
        productSteps.clickAddToCartFromProduct();
    }

    @Test
    public void searchProductFromTheRight(){
        searchSteps.searchProductFromRight("pijamas");
    }

}
