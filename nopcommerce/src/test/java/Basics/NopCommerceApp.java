package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NopCommerceApp {

    WebDriver webDriver;

    @Test
    public void nopCommerceAppTest() throws InterruptedException {
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.get("https://demo.nopcommerce.com/register?returnUrl=%2F"); // This line start the browser
        webDriver.findElement(By.id("gender-male")).click();
        webDriver.findElement(By.id("FirstName")).sendKeys("Enzokuhle");
        webDriver.findElement(By.id("LastName")).sendKeys("Malotana");
        webDriver.findElement(By.name("DateOfBirthDay")).sendKeys("29");
        webDriver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
        webDriver.findElement(By.name("DateOfBirthYear")).sendKeys("2017");
        webDriver.findElement(By.id("Email")).sendKeys("cd189@malotana.com");
        webDriver.findElement(By.id("Company")).sendKeys("FLASH");
        webDriver.findElement(By.id("Password")).sendKeys("Password123");
        webDriver.findElement(By.id("ConfirmPassword")).sendKeys("Password123");
        webDriver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        //String registerResults = webDriver.findElement(By.xpath("//span[contains(.,'Register')]")).getText();
        //Assert.assertEquals(registerResults, "Continue");

        //Login
        webDriver.findElement(By.linkText("Log out")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.linkText("Log in")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("Email")).sendKeys("cd189@malotana.com");
        webDriver.findElement(By.id("Password")).sendKeys("Password123");

        //ComputeTab
        webDriver.findElement(By.linkText("Computers")).click();
        webDriver.findElement(By.xpath("//div[@id='main']/div/div[3]/div/div[2]/div/div/div/div/div/a/img")).click();
        webDriver.findElement(By.id("products-orderby")).sendKeys("Name: A to Z");
        Thread.sleep(1000);
        webDriver.findElement(By.id("products-orderby")).sendKeys("Name: Z to A");
        Thread.sleep(1000);
        webDriver.findElement(By.id("products-orderby")).sendKeys("Price: Low to High");
        Thread.sleep(1000);
        webDriver.findElement(By.id("products-orderby")).sendKeys("Price: High to Low");
        Thread.sleep(1000);
        webDriver.findElement(By.id("products-orderby")).sendKeys("Created on");
        Thread.sleep(1000);
        webDriver.findElement(By.linkText("Computers")).click();
        Thread.sleep(2000);

        //Desktop Items
        webDriver.findElement(By.xpath("//div[@id='main']/div/div[3]/div/div[2]/div/div/div/div/div/a/img")).click();
        webDriver.findElement(By.cssSelector(".item-box:nth-child(1) .product-box-add-to-cart-button")).click();
        Thread.sleep(1000);
        String buildResults = webDriver.findElement(By.cssSelector("h1")).getText();
        webDriver.findElement(By.id("add-to-cart-button-1")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("product_attribute_2")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.id("add-to-cart-button-1")).sendKeys("label=8GB [+$60.00]");
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("#product_attribute_input_3 li:nth-child(2) > label")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("price-value-1")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.id("add-to-cart-button-1")).click();
        Thread.sleep(2000);
        //cart
        //toDO

       /* webDriver.findElement(By.cssSelector("shopping cart")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("tr:nth-child(2) .remove-btn")).click();
        webDriver.findElement(By.cssSelector(".order-total > .cart-total-right")).click();
        webDriver.findElement(By.id("termsofservice")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("checkout")).click();*/

    }

    @AfterTest
    public void closeBrowser(){
        webDriver.quit();
    }
}