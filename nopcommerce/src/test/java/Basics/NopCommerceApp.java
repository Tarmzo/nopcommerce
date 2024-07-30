package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NopCommerceApp {

    WebDriver webDriver;

    @Test
    public void LoginTest() {
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.get("https://demo.nopcommerce.com/register?returnUrl=%2F"); // This line start the browser
        webDriver.findElement(By.id("gender-male")).click();
        webDriver.findElement(By.id("FirstName")).sendKeys("Enzokuhle");
        webDriver.findElement(By.id("LastName")).sendKeys("Malotana");
        webDriver.findElement(By.name("DateOfBirthDay")).sendKeys("29");
        webDriver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
        webDriver.findElement(By.name("DateOfBirthYear")).sendKeys("2017");
        webDriver.findElement(By.id("Email")).sendKeys("enzoklesac@malotana.com");
        webDriver.findElement(By.id("Company")).sendKeys("FLASH");
        webDriver.findElement(By.id("Password")).sendKeys("Password123");
        webDriver.findElement(By.id("ConfirmPassword")).sendKeys("Password123");
        webDriver.findElement(By.id("register-button")).click();

        //Assert.assertEquals(registerResults, "Products");
    }

    @AfterTest
    public void closeBrowser(){
        webDriver.quit();
    }
}