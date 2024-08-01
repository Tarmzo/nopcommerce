package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ComputerTabPage {
    WebDriver webDriver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Computers')]")
    WebElement computer_xpath;

    @FindBy(xpath = "//div[@id='main']/div/div[3]/div/div[2]/div/div/div/div/div/a/img")
    WebElement desktop_xpath;

    @FindBy(xpath = "//input[contains(@id,'products-orderby')]")
    WebElement products_xpath;


    public ComputerTabPage(WebDriver driver){
        this.webDriver = driver;
    }

    public void clickComputerTab(){
        computer_xpath.click();
    }
    public void clickDesktop(){
        desktop_xpath.click();
    }


    public void enterOrderA_Z(String a_z){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(desktop_xpath));
        desktop_xpath.clear();
        desktop_xpath.sendKeys(a_z);
    }

    public void enterOrderLow_High(String low_high){
        products_xpath.clear();
        products_xpath.sendKeys(low_high);
    }

    public void enterOrderHigh_Low(String high_low){
        products_xpath.clear();
        products_xpath.sendKeys(high_low);
    }

    public void enterOrderCreatedOn(String created){
        products_xpath.clear();
        products_xpath.sendKeys(created);
    }
    public void verifyComputerTitleIsDisplayed() {
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(computer_xpath));
        String computerTitle = computer_xpath.getText();
        Assert.assertEquals(computerTitle, "Computers");
    }
}