package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LandingPage {

    WebDriver webDriver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Register')]")
    WebElement landingTitle_xpath;

    public LandingPage(WebDriver driver){
        this.webDriver = driver;
    }

    public void verifyProductTitleIsDisplayed(){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(landingTitle_xpath));
        String productTitle = landingTitle_xpath.getText();
        Assert.assertEquals(productTitle, "Register");
    }

}
