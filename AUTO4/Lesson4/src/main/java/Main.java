import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://saucelabs.com/request-demo");
//        //impliciWait(seconds): hàm đợi tương tác lên web, thời gian  tối đa = seconds giây
//        // thực hiện đợi đến khi element được tìm thấy, không nhất định phải đợi đủ seconds
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//        WebElement email = driver1.findElement(By.id("Email"));
//        email.sendKeys("mailan@gmail.com");
//
//        //expliciWait: hàm đợi có điều kiện, tương tác lên element, đợi tối đa seconds giây
//        //ví dụ: seconds = 10s, tương tác lên button, đợi đến khi button enable để click, kh nhất thiết đủ 10s
//        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
//        //Chờ và tìm phần tử Email
//        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
//        firstName.sendKeys("Mai");
//

        WebElement interestDropdownlist = driver1.findElement(By.id("Solution_Interest__c"));
//        Select interstOptionSelect = new Select(interestDropdownlist);

        //Fill giá trị vào checkbox bằng cách sử dụng javascript
        JavascriptExecutor js = (JavascriptExecutor) driver1;
        js.executeScript("arguments[0].value='Visual Testing';", interestDropdownlist);
//
//        interstOptionSelect.selectByIndex(1);
//        //interstOptionSelect.selectByValue("Scalable Test Automation");
//        Thread.sleep(5000);
//        interstOptionSelect.selectByVisibleText("Mobile Application Testing");
//        System.out.println("Interest selected successfully");
//        driver1.quit();

//        WebDriver driver2 = new ChromeDriver();
//        driver2.get("https://demo.guru99.com/test/radio.html");
//
//        List<WebElement> radioBtns = driver2.findElements(By.xpath("//input[@type=\"radio\"]"));
//        if (!radioBtns.get(2).isSelected()) {
//            System.out.println("Is selected = False");
//            radioBtns.get(2).click();
//            System.out.println(radioBtns.get(2).getAttribute("value") + " is selected");
//        }
//
//        List<WebElement> checkBoxes = driver2.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//        for (int i=0; i< checkBoxes.size() - 1; i++) {
//            if(!checkBoxes.get(i).isSelected()) {
//                checkBoxes.get(i).click();
//                System.out.println(checkBoxes.get(i).getAttribute("value") + " is selected");
//            }
//        }
//
//        Thread.sleep(3000);
//        driver2.quit();

//        WebDriver driver3 = new ChromeDriver();
//        driver3.get(" http://demo.guru99.com/test/simple_context_menu.html");
//
//        Actions doubleClickAction = new Actions(driver3);
//        WebElement doubleClickBtn = driver3.findElement(By.xpath("//button[contains(text(), \"Double-Click\")]"));
//        doubleClickAction.doubleClick(doubleClickBtn).perform();
//        Thread.sleep(3000);
//        System.out.println(driver3.switchTo().alert().getText());
//        driver3.switchTo().alert().accept();
//
//        Actions rightClickAction = new Actions(driver3);
//        WebElement rightClickBtn = driver3.findElement(By.xpath("//span[contains(text(), \"right click\")]"));
//        rightClickAction.contextClick(rightClickBtn).perform();
//        Thread.sleep(3000);
//        WebElement editBtn = driver3.findElement(By.xpath("//li[contains(@class, \"context-menu-icon-edit\")]/child::span"));
//        editBtn.click();
//        Thread.sleep(3000);
//        System.out.println(driver3.switchTo().alert().getText());
//        driver3.switchTo().alert().accept();
//
//        Thread.sleep(3000);
//        driver3.quit();
    }
}
