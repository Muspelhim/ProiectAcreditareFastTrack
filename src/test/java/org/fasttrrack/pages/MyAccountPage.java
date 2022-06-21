package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class MyAccountPage extends BasePage {
    @FindBy (css = ".current")
    private WebElementFacade verifyPage;
    @FindBy (css = "input#username")
    private WebElementFacade emailField;
    @FindBy (css = "input#password")
    private WebElementFacade passwordField;
    @FindBy (css = "p strong:first-child")
    private WebElementFacade user;
    @FindBy (css = ".login .woocommerce-Button")
    private WebElementFacade loginButton;
    @FindBy (css = "li strong")
    private WebElementFacade errorMessage;
    @FindBy (css = "a.my-account")
    private WebElementFacade accountLink;
    @FindBy (css = "#post-7 > div > div > div > div > div > p:nth-child(1) > a")
    private WebElementFacade logOut;

    public void completeEmailField(String email){
        typeInto(emailField,email);
    }
    public void completePasswordField(String password){
        typeInto(passwordField,password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
    public void doLogin(String email,String password){
        completeEmailField(email);
        completePasswordField(password);
        clickLoginButton();
    }

    public void verifyLoggedIn(){

        Assert.assertEquals("Hello" + user, true,"Hello robertcsete1 ");
    }





    public void verifyMyAccountPage(String message){
        verifyPage.shouldContainOnlyText("My Account");
    }

    public void verifyBadCredentialsError(){
        errorMessage.getText().contains("ERROR: Invalid username.");
    }
    public void pressAccountLink(){
        accountLink.click();
    }
    public void pressLogOut(){
        logOut.click();
    }
}
