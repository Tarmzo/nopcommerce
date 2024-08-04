package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;

    @FindBy(xpath = "//input[contains(@id,'title')]")
    WebElement shippingName;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_FirstName')]")
    WebElement BillingNewAddress_FirstName;

    @FindBy(xpath = "//input[contains(@id,'first-name'BillingNewAddress_LastName)]")
    WebElement BillingNewAddress_LastName;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_Email')]")
    WebElement BillingNewAddress_Email;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_Company')]")
    WebElement BillingNewAddress_Company;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_CountryId')]")
    WebElement BillingNewAddress_CountryId;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_StateProvinceId')]")
    WebElement BillingNewAddress_StateProvinceId;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_City')]")
    WebElement BillingNewAddress_City;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_Address1')]")
    WebElement BillingNewAddress_Address1;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_Address2')]")
    WebElement BillingNewAddress_Address2;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_ZipPostalCode')]")
    WebElement BillingNewAddress_ZipPostalCode;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_PhoneNumber')]")
    WebElement BillingNewAddress_PhoneNumber;

    @FindBy(xpath = "//input[contains(@id,'BillingNewAddress_FaxNumber')]")
    WebElement BillingNewAddress_FaxNumber;

    @FindBy(xpath = "//button[contains(@id,'save')]")
    WebElement continueButton;

    @FindBy(xpath = "//button[contains(@id,'.shipping-method-next-step-button')]")
    WebElement shippingButton;

    @FindBy(xpath = "//button[contains(@id,'.payment-method-next-step-button')]")
    WebElement paymentButton;

    @FindBy(xpath = "//input[contains(@id,'b:nth-child(2)')]")
    WebElement validatePrice;

    @FindBy(xpath = "//input[contains(@id,'.confirm-order-next-step-button')]")
    WebElement confirmOrderButton;


    @FindBy(xpath = "//button[contains(@id,'.order-completed-continue-button')]")
    WebElement orderCompleteButton;

    public CheckoutPage( WebDriver driver){
        this.driver = driver;
    }


    public void verifyCheckoutPageTitle() {
        String checkoutTitle = shippingName.getText();
        Assert.assertEquals(checkoutTitle, "Checkout");
    }

    public void enterFirstName(String username){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(BillingNewAddress_FirstName));
        BillingNewAddress_FirstName.clear();
        BillingNewAddress_FirstName.sendKeys(username);
    }

    public void enterLastame(String lastname) {
        BillingNewAddress_LastName.clear();
        BillingNewAddress_LastName.sendKeys(lastname);
    }


    public void enterEmail(String email){
        BillingNewAddress_Email.clear();
        BillingNewAddress_Email.sendKeys(email);
    }

    public void enterCompany(String company){
        BillingNewAddress_Company.clear();
        BillingNewAddress_Company.sendKeys(company);
    }

    public void enterContry(String counrty){
        BillingNewAddress_CountryId.clear();
        BillingNewAddress_CountryId.sendKeys(counrty);
    }

    public void enterProvince(String prov){
        BillingNewAddress_CountryId.clear();
        BillingNewAddress_CountryId.sendKeys(prov);
    }

    public void enterCity(String city){
        BillingNewAddress_City.clear();
        BillingNewAddress_City.sendKeys(city);
    }

    public void enterAddressOne(String addr1){
        BillingNewAddress_Address1.clear();
        BillingNewAddress_Address1.sendKeys(addr1);
    }

    public void enterAddressTwo(String addr2){
        BillingNewAddress_Address2.clear();
        BillingNewAddress_Address2.sendKeys(addr2);
    }

    public void enterZipCode(String code){
        BillingNewAddress_ZipPostalCode.clear();
        BillingNewAddress_ZipPostalCode.sendKeys(code);
    }

    public void enterPhoneNumber(String number){
        BillingNewAddress_PhoneNumber.clear();
        BillingNewAddress_PhoneNumber.sendKeys(number);
    }

    public void enterFaxNumber(String fax){
        BillingNewAddress_FaxNumber.clear();
        BillingNewAddress_FaxNumber.sendKeys(fax);
    }

    public void clickContinueButton(){
        continueButton.click();
    }
}
