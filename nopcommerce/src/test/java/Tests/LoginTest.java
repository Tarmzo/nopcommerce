package Tests;

import Utils.ReadData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends Base{

    public void enterEmailTests(){
        loginPage.enterEmail(readData.email);
    }

    @Test(dependsOnMethods = "enterEmailTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(readData.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginButtonTests() {
        loginPage.enterPassword(readData.password);
    }

    //ToDo read data from faker library

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
