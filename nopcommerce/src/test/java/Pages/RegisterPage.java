package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;

    @FindBy(xpath = "//input[contains(@id,'gender-male')]")
    WebElement gender_xpath;

    @FindBy(xpath = "//input[contains(@id,'FirstName')]")
    WebElement firstname_xpath;

    @FindBy(xpath = "//input[contains(@id,'LastName')]")
    WebElement lastname_xpath;

    @FindBy(xpath = "//input[contains(@id,'DateOfBirthDay')]")
    WebElement dateOfBirthDay_xpath;

    @FindBy(xpath = "//input[contains(@id,'DateOfBirthMonth')]")
    WebElement dateOfBirthMonth_xpath;

    @FindBy(xpath = "//input[contains(@id,'DateOfBirthYear')]")
    WebElement dateOfBirthYear_xpath;

    @FindBy(xpath = "//input[contains(@id,'Email')]")
    WebElement email_xpath;

    @FindBy(xpath = "//input[contains(@id,'Company')]")
    WebElement company_xpath;

    @FindBy(xpath = "//input[contains(@id,'Password')]")
    WebElement password_xpath;

    @FindBy(xpath = "//input[contains(@id,'ConfirmPassword')]")
    WebElement confirmPasssword_xpath;

    @FindBy(id = "register-button")
    WebElement loginButton_id;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    public void gender(String gender){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(gender_xpath));
        gender_xpath.clear();
        gender_xpath.sendKeys(gender);
    }

    public void enterUsername(String username){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(firstname_xpath));
        firstname_xpath.clear();
        firstname_xpath.sendKeys(username);
    }

    public void enterLastName(String surname){
        lastname_xpath.clear();
        lastname_xpath.sendKeys(surname);
    }

    public void enterDateOfBirthDay(String dob){
        dateOfBirthDay_xpath.clear();
        dateOfBirthDay_xpath.sendKeys(dob);
    }

    public void enterDateOfBirthMonth(String mob){
        dateOfBirthMonth_xpath.clear();
        dateOfBirthMonth_xpath.sendKeys(mob);
    }

    public void enterDateOfBirthYear(String yob){
        dateOfBirthYear_xpath.clear();
        dateOfBirthYear_xpath.sendKeys(yob);
    }

    public void enterEmail(String email){
        email_xpath.clear();
        email_xpath.sendKeys(email);
    }

    public void enterCompany(String company){
        company_xpath.clear();
        company_xpath.sendKeys(company);
    }

    public void enterPassword(String password){
        password_xpath.clear();
        password_xpath.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        confirmPasssword_xpath.clear();
        confirmPasssword_xpath.sendKeys(confirmPassword);
    }

    public void clickRegisterButton(){
        loginButton_id.click();
    }
}
