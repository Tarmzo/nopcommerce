package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class PriceValidationPage {

    double subTotalTrim;
    double taxTrim;
    double totalCalculated;

    @FindBy(xpath = "//input[contains(@id,'title')]")
    WebElement shippingName;

    @FindBy(xpath = "//div[contains(@class,'.value-summary > strong')]")
    WebElement subTotalAmount;

    @FindBy(xpath = "//div[contains(@class,'b:nth-child(6)')]")
    WebElement taxForPurchase;

    @FindBy(xpath = "//div[contains(@class,'.payment-method > .label)]")
    WebElement totalAmount;

    @FindBy(xpath = "//button[contains(@id,'checkout-step-confirm-order')]")
    WebElement cancelOrder;

    @FindBy(xpath = "//h2[contains(@class,'.payment-method > .label')]")
    WebElement confirmationOrderText;

    @FindBy(xpath = "//button[contains(@id,'order-completed-continue-button')]")
    WebElement finishButton;

    public void verifyOverviewPageTitle(){
        String overviewPage = shippingName.getText();
        assertEquals(overviewPage,"Shipping cart");
    }

    public void verifySubTotalAmount(){
        String subTotal = subTotalAmount.getText();
        System.out.println(subTotal);
        String subTotalString = subTotal.substring(13);
        subTotalTrim = Double.parseDouble(subTotalString);
        System.out.println(subTotalTrim);
    }

    public void verifyTaxForPurchase(){
        String tax = taxForPurchase.getText();
        System.out.println(tax);
        String subTaxString = tax.substring(6);
        taxTrim = Double.parseDouble(subTaxString);
    }

    public void verifyConfirmationOrderText(){
        String successOrderMessage = confirmationOrderText.getText();
        assertEquals(successOrderMessage,"Thank you for your order!");
    }

    public void verifyTotalAmount(){
        double AssertedTotal;
        String theTotalAmount = totalAmount.getText();
        String trimToTalAmount = theTotalAmount.substring(8);
        System.out.println(trimToTalAmount);
        AssertedTotal = Double.parseDouble(trimToTalAmount);
        totalCalculated = subTotalTrim + taxTrim;
        //Assert.assertEquals(theTotalAmount,"Total: $"+);

        if (totalCalculated == AssertedTotal){

            finishButton.click();
            verifyConfirmationOrderText();
            Assert.assertTrue(true);
        }else{
            cancelOrder.click();
            Assert.fail();

        }
    }

}
