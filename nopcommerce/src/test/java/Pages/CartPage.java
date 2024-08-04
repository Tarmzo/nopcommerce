package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Computers')]")
    WebElement shoppingCart_xpath;

    @FindBy(xpath = "//input[contains(@id,'termsofservice')]")
    WebElement termsofservice;

    @FindBy(xpath = "//input[contains(@id,'product')]")
    WebElement product_attribute_xpath;


    @FindBy(xpath = "//button[contains(@id,'checkout')]")
    WebElement checkoutButton;

    public void verifyProductIsStillInCart(){
        String ItemInfo = product_attribute_xpath.getText();
        Assert.assertEquals(ItemInfo,"Shopping cart");
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public void checkTermsAndConditions(){
        termsofservice.isSelected();
    }
}
