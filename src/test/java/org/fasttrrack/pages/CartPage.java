package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrrack.utils.Constants;

import java.util.List;
public class CartPage extends BasePage  {

    private String discount="percentage25";

    @FindBy (css = ".cart-empty")
    private WebElementFacade emptyCart;

    @FindBy (css = "input#coupon_code")
    private WebElementFacade couponField;

    @FindBy (css = "input.button")
    private WebElementFacade applyCouponButton;

    @FindBy (css = " .cart-discount th")
    private WebElementFacade couponMessage;

    @FindBy (css = ".product-cart-total .price")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy (css = "#shopping-cart-totals-table tbody tr:nth-child(1) .price")
    private WebElementFacade subtotalText;

    @FindBy (css = "#shopping-cart-totals-table tbody tr:nth-child(2) .price")
    private WebElementFacade shippingFeeText;

    @FindBy (css = "#shopping-cart-totals-table tfoot .price")
    private WebElementFacade grandTotal;

    @FindBy (css = ".entry-title")
    private WebElementFacade cartPage;

    @FindBy (css = ".product-price")
    private WebElementFacade priceList;

    @FindBy (css = ".checkout-button")
    private WebElementFacade checkoutButton;

    @FindBy (css = ".qty")
    private WebElementFacade quantityCheckoutForOneProduct;

    @FindBy (css = "[name=update_cart]")
    private WebElementFacade updateCart;

    @FindBy (css = ".woocommerce-message")
    private WebElementFacade cartUpdateMessage;


    public void updateCartMessage(){
        cartUpdateMessage.shouldContainText("Cart updated.");
    }

    public void clickUpdateCart(){
        clickOn(updateCart);
    }

    public void changeTheQuantityFOrOneProduct(){
        typeInto(quantityCheckoutForOneProduct, RandomStringUtils.randomNumeric(1));
    }

    public void clickCheckoutButton(){
        waitABit(500);
        clickOn(checkoutButton);
    }

    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == getIntFromPrice(grandTotal.getText());
    }

    public void verifyCouponMessage(){
        couponMessage.shouldContainText("COUPON:");
    }

    public void clickApplyCouponButton(){
        clickOn(applyCouponButton);
    }

    public void completeCouponField(){
        typeInto(couponField,discount);
    }

    public void addDiscount(){
        completeCouponField();
        clickApplyCouponButton();
    }

    public void verifyEmptyCart(){
        emptyCart.shouldContainOnlyText("Your cart is currently empty.");
    }

    public void verifyCartNotLoggedIn(){
        cartPage.getText().equals("Cart");
    }

    public void verifyCartLoggedIn(){
        cartPage.getText().equals("Cart");
    }

    public void verifyCheckoutButton(){
        checkoutButton.getText().equals(" Proceed to checkout");
    }
        }



