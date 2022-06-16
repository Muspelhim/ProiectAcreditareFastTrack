package org.fasttrrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.fasttrrack.utils.Constants;

import java.util.List;
public class CartPage extends PageObject  {
    private BasePage basePage;

    @FindBy (css = ".cart-empty")
    private WebElementFacade emptyCart;
    @FindBy (css = "input#coupon_code")
    private WebElementFacade couponField;
    @FindBy (css = "input.button")
    private WebElementFacade applyCouponButton;
    @FindBy (css = " .cart-discount th")
    private WebElementFacade couponMessage;

    @FindBy(css = ".product-cart-total .price")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = "#shopping-cart-totals-table tbody tr:nth-child(1) .price")
    private WebElementFacade subtotalText;

    @FindBy(css = "#shopping-cart-totals-table tbody tr:nth-child(2) .price")
    private WebElementFacade shippingFeeText;

    @FindBy(css = "#shopping-cart-totals-table tfoot .price")
    private WebElementFacade grandTotal;

    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += basePage.getIntFromPrice(element.getText());
        }
        System.out.println(sum);
        return sum;

    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == basePage.getIntFromPrice(subtotalText.getText());
    }


    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return basePage.getIntFromPrice(x) + basePage.getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == basePage.getIntFromPrice(grandTotal.getText());
    }



    public void verifyCouponMessage(){
        couponMessage.shouldContainText("COUPON:");
    }
    public void clickApplyCouponButton(){
        clickOn(applyCouponButton);
    }
    public void completeCouponField(){
        typeInto(couponField, Constants.DISCOUNT);
    }
    public void addDiscount(){
        completeCouponField();
        clickApplyCouponButton();
    }



    public void verifyEmptyCart(){
        emptyCart.shouldContainOnlyText("Your cart is currently empty.");
    }
}