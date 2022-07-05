package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrrack.pages.*;
import org.fasttrrack.utils.Constants;


public class CheckoutSteps extends ScenarioSteps {

    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private CartPage cartPage;
    private ProductPage productPage;
    private ShopPage shopPage;
    private MyAccountPage myAccountPage;


    private String address= RandomStringUtils.randomAlphabetic(10);
    private String city = RandomStringUtils.randomAlphabetic(8);
    private String postcode = RandomStringUtils.randomNumeric(6);
    private String phone = "+4"+RandomStringUtils.randomNumeric(10);
    private String firstNameNotLoggedIn=RandomStringUtils.randomAlphabetic(6);
    private String lastNameNotLoggedIn=RandomStringUtils.randomAlphabetic(6);
    private String emailNotLoggedIn=RandomStringUtils.randomAlphabetic(10)+"@email.com";




    @Step
    public void verifyCheckoutPageWithNoProducts(){
        homePage.clickOnCheckout();
        cartPage.verifyEmptyCart();
    }

    @Step
    public void completeFirstNameLoggedIn(){
        checkoutPage.completeOnFirstName(Constants.USER_FIRST);
    }

    @Step
    public void completeLastNameLoggedIn(){
        checkoutPage.completeOnLastName(Constants.USER_LAST);
    }

    @Step
    public void completeAddressLoggedIn(){
        checkoutPage.completeOnAddress(Constants.USER_ADDRESS);
    }

    @Step
    public void completeCityLoggedIn(){
        checkoutPage.completeOnCity(Constants.USER_CITY);
    }

    @Step
    public void completePostCodeLoggedIn(){
        checkoutPage.completeOnPostCode(Constants.USER_POSTCODE);
    }

    @Step
    public void completePhoneLoggedIn(){
        checkoutPage.completeOnPhone(Constants.USER_PHONE);
    }

    @Step
    public void completeFirstNameNotLoggedIn(){
        checkoutPage.completeOnFirstName(firstNameNotLoggedIn);
    }

    @Step
    public void completeLastNameNotLoggedIn(){
        checkoutPage.completeOnLastName(lastNameNotLoggedIn);
    }

    @Step
    public void completeAddressNotLoggedIn(){
        checkoutPage.completeOnAddress(address);
    }

    @Step
    public void completeCityNotLoggedIn(){
        checkoutPage.completeOnCity(city);
    }

    @Step
    public void completePostcodeNotLoggedIn(){
        checkoutPage.completeOnPostCode(postcode);
    }

    @Step
    public void completePhoneNotLoggedIn(){
        checkoutPage.completeOnPhone(phone);
    }

    @Step
    public void completeEmailNotLoggedIn(){
        checkoutPage.completeOnEmail(emailNotLoggedIn);
    }

    @Step
    public void clickOnPlaceOrder(){
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void verifyCheckOutMessage(){
        checkoutPage.checkoutMessageOrder();
    }

    @Step
    public void clickRemoveCoupon(){
        checkoutPage.clickOnRemoveCouponButton();
    }

    @Step
    public void verifyIfCouponRemoveMessage(){
        checkoutPage.verifyCouponRemoveMessage();
    }

    @Step
    public void proceedToCheckOutLoggedIn(){
        homePage.open();
        homePage.clickOnLoggIN();
        myAccountPage.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        homePage.clickOnShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        checkoutPage.clickCheckoutButton();
    }

    @Step
    public void proceedToCheckoutNotLoggedIn(){
        homePage.open();
        homePage.clickOnShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        checkoutPage.clickCheckoutButton();
    }

    @Step
    public void proceedToCheckOutWithDiscountNotLoggedIn(){
        homePage.open();
        homePage.clickOnShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        cartPage.addDiscount();
        checkoutPage.clickCheckoutButton();
    }

    @Step
    public void doCheckOutLoggedIn(){
        homePage.open();
        homePage.clickOnLoggIN();
        myAccountPage.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        homePage.clickOnShop();
        shopPage.selectOrderHighToLow();
        shopPage.selectFirstProduct();
        productPage.clickOnAddToCartFromProduct();
        homePage.clickOnCart();
        checkoutPage.clickCheckoutButton();
    }

    @Step
    public void completeCheckoutLoggedIn(){
        completeFirstNameLoggedIn();
        completeLastNameLoggedIn();
        completeAddressLoggedIn();
        completeCityLoggedIn();
        completePostCodeLoggedIn();
        completePhoneLoggedIn();
        clickOnPlaceOrder();
        verifyCheckOutMessage();
    }

    @Step
    public void doCompleteCheckOutLoggedIn(){
        proceedToCheckOutLoggedIn();
        completeCheckoutLoggedIn();
    }

    @Step
    public void doCheckOutNotLoggedIn(){
        completeFirstNameNotLoggedIn();
        completeLastNameNotLoggedIn();
        completeAddressNotLoggedIn();
        completeCityNotLoggedIn();
        completePostcodeNotLoggedIn();
        completePhoneNotLoggedIn();
        completeEmailNotLoggedIn();
        clickOnPlaceOrder();
        verifyCheckOutMessage();
    }

    @Step
    public void doCompleteCheckoutNotLoggedIn(){
        proceedToCheckoutNotLoggedIn();
        doCheckOutNotLoggedIn();
    }

}
