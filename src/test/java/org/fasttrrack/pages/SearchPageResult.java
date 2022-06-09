package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SearchPageResult extends PageObject {
    @FindBy (css = ".entry-title.ak-container")
    private WebElementFacade verifySearch;


    public void verifySearchFromTop(String search){
        verifySearch.shouldContainOnlyText("SEARCH RESULTS: “"+search+"”");
    }



}
