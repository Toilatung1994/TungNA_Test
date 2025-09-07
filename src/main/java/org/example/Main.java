package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(2000);
        WebElement pwInput = driver.findElement(By.xpath("//input[@id='password']"));
        pwInput.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement btnInput = driver.findElement(By.xpath("//input[@id='login-button']"));
        btnInput.click();
        Thread.sleep(2000);
        WebElement add1Click = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        add1Click.click();
        Thread.sleep(5000);
        WebElement add2Click = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        add2Click.click();
        Thread.sleep(2000);
        WebElement cartClick = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartClick.click();
        Thread.sleep(2000);
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        Thread.sleep(2000);
        WebElement firstnameInput = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstnameInput.sendKeys("Tung");
        Thread.sleep(2000);
        WebElement lastnameInput = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastnameInput.sendKeys("Nguyen");
        Thread.sleep(2000);
        WebElement postalCodeInput = driver.findElement(By.xpath("//input[@id='postal-code']"));
        postalCodeInput.sendKeys("091294");
        Thread.sleep(2000);
        WebElement continueClick = driver.findElement(By.xpath("//input[@id='continue']"));
        continueClick.click();
        Thread.sleep(2000);
        driver.quit();
    }
}