import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ActionBasedLoginPageTest {
    private static final String EXCEL_PATH = "src/main/resources/dataLogin.xlsx";
    private static final String SHEET_NAME = "Sheet1";
    private static final String LOGIN_URL = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        List<Map<String, String>> testData = ExcelUtils.readExcelData(EXCEL_PATH, SHEET_NAME);
        WebDriver driver = new ChromeDriver();
        try {
            for(Map<String, String> row : testData) {
                String user = row.get("Username");
                String pass = row.get("Password");

                System.out.println("Dang thu dang nhap voi User: " + user);
                driver.get(LOGIN_URL);

                ReadToFileSauceLabs.loginAction(driver, user, pass);
            }
        } finally {
            //Luôn luôn đóng trình duyệt ở khối finally
            driver.quit();
        }

    }



}
