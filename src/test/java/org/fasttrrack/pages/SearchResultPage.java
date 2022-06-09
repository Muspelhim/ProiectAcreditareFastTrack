package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy (css = ".entry-title.ak-container")
    private WebElementFacade verifySearch;
    @FindBy (css = ".product_cat-hoodies")
    private List<WebElementFacade> productList;


    public boolean checkListForProduct(String productName){
        for (WebElementFacade element : productList){
            if (element.findElement(By.cssSelector("h3")).getText().equals(productName));
                return true;
        }
        return false;

    }

    public void selectItemFromList(String productName){
        for (WebElementFacade element : productList){
            if (element.findElement(By.cssSelector("h3")).getText().equals(productName));
                element.click();
//                element.findElement(By.cssSelector("h3")).click();
                break;
        }
    }

    public void verifySearchFromTop(String productName){
        verifySearch.shouldContainOnlyText("SEARCH RESULTS: “"+productName+"”");
    }



}
