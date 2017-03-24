/**
 * Created by Iryna Lasotskaya on 08.03.2017.
 */

import Pages.LoginPage;
import Pages.MainPage;
import Pages.MainPageFunctions;
import Pages.TestProperties;
import Pages.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;
import java.io.File;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class AppTest {
    private static final String FIRSTACCOUNT = "webdriverlasotskaya@gmail.com";
    private static final String SECONDACCOUNT = "webdriverlasotski@gmail.com";
    private static final String PASSWORD = "WebDriver1";
    private static final String SUBJECT = "Hi";
    WebDriver driver = new ChromeDriver();
    private final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);

    @Test
    public void googleLettersTest() {
        System.setProperty("webdriver.gecko.driver", new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe").getAbsolutePath());
        MainPageFunctions pageFunctions = new MainPageFunctions(driver);
        pageFunctions.signInFirstUser();
        Logger log = Logger.getInstance();
        log.info("First user is signed-in");
        pageFunctions.newLetter();
       log.info ("Letter is written and sent");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        MainPage mainPage = new MainPage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.signOut();
        pageFunctions.makeLetterSpam();
        log.info("Second user is signed-in and made letter spam");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        mainPage.signOut();
        LoginPage appSignIn = new LoginPage(driver);
        appSignIn.signIn(FIRSTACCOUNT, PASSWORD);
        appSignIn.signInWithSavingCookie();
        log.info("First user is signed-in");
        pageFunctions.newLetter();
        log.info("Letter is written and sent");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='vh']"))));
        mainPage.signOut();
        pageFunctions.verifyThatLetterInSpam();
        log.info("Second user is signed-in and verified that letter is in spam");
        Assert.assertTrue(mainPage.isSpam());
    }

    protected WebDriver getDriver() {
        if (driver == null) {
            String browser = TestProperties.getTestProperty("browser");
            if ("internetexplorer".equals(browser)) {
                driver = new FirefoxDriver();
            }
            if ("chrome".equals(browser)) {
                driver = new ChromeDriver();
            }
        }
        return driver;
    }
}