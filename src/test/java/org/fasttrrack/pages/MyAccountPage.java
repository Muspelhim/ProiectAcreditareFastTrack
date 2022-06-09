package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyAccountPage extends PageObject {
    @FindBy (css = ".current")
    private WebElementFacade verifyPage;

    public void verifyMyAccountPage(String message){
        verifyPage.shouldContainOnlyText("My Account");
    }
}
