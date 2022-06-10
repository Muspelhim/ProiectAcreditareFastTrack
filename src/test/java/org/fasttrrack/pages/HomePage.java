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
    @FindBy (id = "menu-item-70")
    private WebElementFacade myAccount;
    @FindBy (id = "menu-item-71")
    private WebElementFacade checkOut;
    @FindBy (id = "menu-item-72")
    private WebElementFacade cart;
    @FindBy (id =  "menu-item-73")
    private WebElementFacade shop;
    @FindBy (css = ".account")
    private WebElementFacade loggIn;

    public void clickLoggIN(){
        clickOn(loggIn);
    }
    public void clickOnCheckout(){
        clickOn(checkOut);
    }
    public void clickOnCart(){
        clickOn(cart);
    }
    public void clickOnShop(){
        clickOn(shop);
    }
    public void clickOnMyAccount(){
        clickOn(myAccount);

    }
    public void clickOnSearchFromTop(){
        clickOn(clickSearchTop);
    }
    public void searchFromTop(String keyword){
        typeInto(searchTop,keyword);
    }
}
