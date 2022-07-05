package org.fasttrrack.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;


public class ProductPage extends BasePage {
    String quantity= RandomStringUtils.randomNumeric(1);
    String review="A nice Hoodie with a nice LOGO :)";
    @FindBy (css = ".single_add_to_cart_button")
    private WebElementFacade addToCartFromProduct;

    @FindBy (css = "h1.product_title")
    private WebElementFacade productTitle;

    @FindBy (css = ".woocommerce-message")
    private WebElementFacade productMessage;

    @FindBy (css = ".qty")
    private WebElementFacade quantityProduct;

    @FindBy (id = "pa_color")
    private WebElementFacade hoodieColorDropdown;

    @FindBy (id = "logo")
    private WebElementFacade hoodieLogoDropdown;

    @FindBy (css = "li#tab-title-reviews ")
    private WebElementFacade reviewTab;

    @FindBy (css = "textarea#comment")
    private WebElementFacade reviewMessage;

    @FindBy (css = ".star-5")
    private WebElementFacade reviewRating;

    @FindBy (css = "input#author")
    private WebElementFacade reviewName;

    @FindBy (css = "input#email")
    private WebElementFacade reviewEmail;

    @FindBy (css = "input#submit")
    private WebElementFacade submitReview;

    @FindBy (css = ".woocommerce-review__awaiting-approval")
    private WebElementFacade reviewSuccess;
//    @FindBy (css = "p:nth-child(2)")
//    private WebElementFacade wrongEmailReview;
//
//    public void noEmailReview(){
//        waitFor(wrongEmailReview.getTextContent());
//        String email=wrongEmailReview.getTextContent();
//        Assert.assertTrue(email,"ERROR: please enter a valid email address.");
//    }
//    "Your review is awaiting approval"
    public void reviewSuccessMessage(){
        reviewSuccess.getText().equals("Your review is awaiting approval");


    }
    public void nameOfReviews(){
        typeInto(reviewName,RandomStringUtils.randomAlphabetic(5)+" "+RandomStringUtils.randomAlphabetic(5));
    }
    public void emailOfReviews(){
        typeInto(reviewEmail,RandomStringUtils.randomAlphabetic(8)+"@email.com");
    }

    public void clickSubmitReview(){
        clickOn(submitReview);
    }

    public void reviewsMessage(){
        typeInto(reviewMessage,review);
    }

    public void clickReviewStar(){
        clickOn(reviewRating);
    }

    public void reviewsTab(){
        clickOn(reviewTab);
    }

    public void submitReviewWithNoStar(){
        submitReview.click();
        waitABit(900);
        getAlert().accept();
        
    }
    public void selectHoodieColor(){
        selectFromDropdown(hoodieColorDropdown,"Green");
    }

    public void selectLogo(){
        selectFromDropdown(hoodieLogoDropdown,"No");

    }

    public void verifyChangeQuantity(){
        String product =productTitle.getTextContent();
        productMessage.shouldContainText(quantity+" × “"+product+"” have been added to your cart.");
    }


    public void changeQuantity(){
        typeInto(quantityProduct,quantity);
    }

    public void productAddedToCartMessage(){
        String product =productTitle.getTextContent();
        productMessage.shouldContainText("“"+product+"” has been added to your cart.");
    }

    public void clickOnAddToCartFromProduct(){
        clickOn(addToCartFromProduct);
    }
}
