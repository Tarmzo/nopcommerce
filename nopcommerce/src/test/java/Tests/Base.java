package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadData;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome","https://demo.nopcommerce.com/");
    RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
    LandingPage landingPage  = PageFactory.initElements(driver, LandingPage.class);
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    ComputerTabPage computerTabPage = PageFactory.initElements(driver, ComputerTabPage.class);
    DesktopPage desktopPage = PageFactory.initElements(driver, DesktopPage.class);
    CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    TakeScreenshots takesScreenshots = new TakeScreenshots();

    ReadData readData;
    {
        try {
            readData = new ReadData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
