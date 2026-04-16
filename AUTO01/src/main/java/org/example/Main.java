package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //mo trang login
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");

        //Tim input username
        WebElement userName = webDriver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement button = webDriver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));

        //Tim input password
        WebElement passWord = webDriver.findElement(By.id("password"));
        passWord.sendKeys("secret_sauce");

        //Sleep: ham cho theo mili giay, nen dung WebDriverWait trong thuc te
        Thread.sleep(3000);

        //Click Login
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();

        //In title sau khi login
        System.out.println("Page title " + webDriver.getTitle());

        //Close trinh duyet
        Thread.sleep(5000);
        webDriver.quit();
    }
}