package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DesktopPage {

    WebDriver webDriver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Computers')]")
    WebElement computer_xpath;

    @FindBy(xpath = "//div[@id='main']/div/div[3]/div/div[2]/div/div/div/div/div/a/img")
    WebElement desktop_xpath;

    @FindBy(xpath = "//input[contains(@id,'add-to-cart-button-1')]")
    WebElement addToCartButton_xpath;

    @FindBy(xpath = "//input[contains(@id,'product_attribute_2')]")
    WebElement product_attribute_2_xpath;

    @FindBy(xpath = "#product_attribute_input_3 li:nth-child(2) > label")
    WebElement product_input3_xpath;

    @FindBy(xpath = "price-value-1")
    WebElement price_value_xpath;

    @FindBy(xpath = "add-to-cart-button-1")
    WebElement addToCart_id;

    public DesktopPage(WebDriver driver){
        this.webDriver = driver;
    }

    public void clickComputerTab(){
        computer_xpath.click();
    }
    public void clickDesktop(){
        desktop_xpath.click();
    }

    public void clickAddToCartButton(){
        addToCartButton_xpath.click();
    }

    public void clickProductAttribute(){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(product_attribute_2_xpath));
        product_attribute_2_xpath.clear();
        product_attribute_2_xpath.click();
    }

    public void enterRAM(String ram){
        addToCartButton_xpath.clear();
        addToCartButton_xpath.sendKeys(ram);
    }

    public void enterHdd(String hdd){
        product_input3_xpath.clear();
        product_input3_xpath.sendKeys(hdd);
    }

    public void clickTotal(){
        price_value_xpath.clear();
        price_value_xpath.click();
    }

    public void clickAddToCartLastButton(){
        addToCart_id.click();
    }








}
