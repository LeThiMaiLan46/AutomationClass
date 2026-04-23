package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAction {
    public static void loginAction(WebDriver driver, String user, String pass) {
        WebElement userField = driver.findElement(By.id("user-name"));
        WebElement passField = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        userField.sendKeys(user);
        passField.sendKeys(pass);
        loginBtn.click();
    }
}
