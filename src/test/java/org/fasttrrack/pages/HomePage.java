package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;



@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy (css = ".search-form .search-field")
    private WebElementFacade searchTop;
    @FindBy (css = ".search-form .fa-search")
    private WebElementFacade clickSearchTop;


    public void clickOnSearchFromTop(){
        clickOn(clickSearchTop);
    }
    public void searchFromTop(String keyword){
        typeInto(searchTop,keyword);
    }
}
