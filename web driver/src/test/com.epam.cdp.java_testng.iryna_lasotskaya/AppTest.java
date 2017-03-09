/**
 * Created by Iryna Lasotskaya on 08.03.2017.
 */
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
public class AppTest {
    @Test
    public void OneCanViewStackoverflow()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.stackoverflow.com/");
        System.out.println(driver.getTitle());
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript("document.getElementById('nav-tags').click()");
        System.out.println(driver.getTitle());
        driver.quit();
    }


}
