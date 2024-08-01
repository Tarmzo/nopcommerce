package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver webDriver;

    @FindBy(xpath = "//input[contains(@id,'Email')]")
    WebElement email_xpath;

    @FindBy(xpath = "//input[contains(@id,'Password')]")
    WebElement password_xpath;

    @FindBy(id = "register-button")
    WebElement loginButton_id;

    public LoginPage(WebDriver driver){
        this.webDriver=driver;
    }

    public void enterEmail(String email){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(email_xpath));
        email_xpath.clear();
        email_xpath.sendKeys(email);
    }

    public void enterPassword(String password){
        password_xpath.clear();
        password_xpath.sendKeys(password);
    }

    public void clickLogin(){
        loginButton_id.click();
    }


}
