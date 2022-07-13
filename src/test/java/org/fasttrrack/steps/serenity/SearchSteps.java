package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;
import org.fasttrrack.pages.SearchResultPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;


    @Step
    public void searchFromTop(String keyword){
        homePage.open();
        homePage.searchFromTop(keyword);
        homePage.clickOnSearchFromTop();
    }

    @Step
    public void verifySearchMessage(String productName){
        searchResultPage.verifySearchFromTop(productName);
    }

    @Step
    public void verifyProductInResults(String productName){
        Assert.assertTrue(searchResultPage.checkListForProduct(productName));
    }

    @Step
    public void clickOnProduct(String productName){
        searchResultPage.selectItemFromList(productName);
        waitABit(3000);
    }

    @Step
    public void searchProductFromRight(String search){
        homePage.completeSearchFromTheRight(search);
        homePage.clickOnSearchFromRight();
        searchResultPage.noProductsInSearch();
    }
}
